<?php



namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Validation\Rule;
use App\Models\Cliente; 

class ClienteController extends Controller {

    public function index() {
        $clientes = Cliente::all();
        return view('clientes.index', compact('clientes'));
    }

    public function edit($cuit) {

        $cliente = Cliente::where('cuit', $cuit)->first();

        if ($cliente) {

            return view('clientes.edit', ['cliente' => $cliente]);
        } else {

            return redirect()->route('importacion.index')->with('error', 'Cliente no encontrado');
        }
    }

    public function update(Request $request, Cliente $cliente) {
        // Validación de campos
        $request->validate([
            'cuit' => ['required', Rule::unique('clientes')->ignore($cliente->id)],
            'razon_social' => 'required',
            'nro_cliente' => ['required', Rule::unique('clientes')->ignore($cliente->id)],
                
                ], [
            'cuit.required' => 'El CUIT es obligatorio.',
            'cuit.unique' => 'El CUIT ingresado ya está registrado en la base de datos.',
            'razon_social.required' => 'La Razón Social es obligatoria.',
            'nro_cliente.required' => 'El Nro de Cliente es obligatorio.',
            'nro_cliente.unique' => 'El Nro de Cliente ingresado ya está registrado en la base de datos.',
                
        ]);

        try {
            // Actualizar el cliente solo si hay cambios
            $cliente->update([
                'cuit' => $request->input('cuit'),
                'razon_social' => $request->input('razon_social'),
                'nro_cliente' => $request->input('nro_cliente'),
                   
            ]);

            return redirect()->route('importacion.index')->with('success', 'Cliente actualizado exitosamente');
        } catch (\Exception $e) {
            // En caso de error, redirige de nuevo al formulario con un mensaje de error
            return redirect()->route('clientes.edit', $cliente)->withErrors(['error' => 'Hubo un error al actualizar el cliente'])->withInput();
        }
    }

    public function create() {
        return view('clientes.create');
    }

    public function store(Request $request) {
        // Validación de campos 
        $request->validate([
            'cuit' => 'required|unique:clientes,cuit',
            'razon_social' => 'required',
            'nro_cliente' => 'required|unique:clientes,nro_cliente',
                ], [
            'cuit.unique' => 'El CUIT ingresado ya está registrado en la base de datos.',
            'nro_cliente.unique' => 'El Nro de Cliente ingresado ya está registrado en la base de datos.',
        ]);

        try {
            // Crear un nuevo cliente con los datos del formulario
            $cliente = new Cliente([
                'cuit' => $request->input('cuit'),
                'razon_social' => $request->input('razon_social'),
                'nro_cliente' => $request->input('nro_cliente'),
                'ytd' => 0,
                'tier' => 1
            ]);

            // Guardar el cliente en la base de datos
            $cliente->save();

            return redirect('/importacion')->with('success', 'Cliente creado exitosamente');
        } catch (\Exception $e) {
            // En caso de error (por ejemplo, violación de la restricción UNIQUE),
            // redirige de nuevo al formulario con un mensaje de error
            return redirect('/cliente/create')
                            ->withErrors(['error' => 'El CUIT o Nro Cliente ya existe en la base de datos'])
                            ->withInput();
        }
    }
}
