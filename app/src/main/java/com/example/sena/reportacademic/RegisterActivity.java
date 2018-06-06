package com.example.sena.reportacademic;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sena.reportacademic.utilidades.Utilidades;

public class RegisterActivity extends AppCompatActivity {

    EditText campoDocumento,campoNombre,campoApellido,
            campoFechaNacimiento,campoNombreAcudiente,
            campoGrado,campoContraseña,campoConfirmarContraseña,user_id_user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        campoDocumento           = (EditText) findViewById(R.id.documento_estudiante);
        campoNombre              = (EditText) findViewById(R.id.nombre_studiante);
        campoApellido            = (EditText) findViewById(R.id.apellido_etudiante);
        campoFechaNacimiento     = (EditText) findViewById(R.id.fecha_nacimiento_estudiante);
        campoNombreAcudiente     = (EditText) findViewById(R.id.nombre_acudiente);
        campoGrado               = (EditText) findViewById(R.id.id_grado);
        campoContraseña          = (EditText) findViewById(R.id.contraseña_estudiante);
        campoConfirmarContraseña = (EditText) findViewById(R.id.confirmar_contraseña);
        user_id_user             = (EditText) findViewById(R.id.documento_estudiante);

    }
    public void onClick(View view)
    {
        registrarEstudiante();
    }

    private void registrarEstudiante()
    {
        // HABRIR LA CONEXION PARA IMPLEMMENTAR EL ESTRUCTURAMIENTO EN LA BASE DE DATOS
        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this,"db_ReportAcadeic",null,1);

        //ACTIVO LA BASE DE DATOS PARA PODER EDITARLA
        SQLiteDatabase db = conn.getWritableDatabase();

        ContentValues values =new ContentValues();

        values.put(Utilidades.CAMPO_DOCUMENTO,campoDocumento.getText().toString());
        values.put(Utilidades.CAMPO_NOMBRE,campoNombre.getText().toString());
        values.put(Utilidades.CAMPO_APELLIDO,campoApellido.getText().toString());
        values.put(Utilidades.CAMPO_FECHA_NACIMIENTO,campoFechaNacimiento.getText().toString());
        values.put(Utilidades.CAMPO_NOMBRE_ACUDIENTE,campoNombreAcudiente.getText().toString());
        values.put(Utilidades.CAMPO_GRADO,campoGrado.getText().toString());
        values.put(Utilidades.CAMPO_CONTRASEÑA,campoContraseña.getText().toString());
        values.put(Utilidades.CAMPO_CONFIRMAR_CONTRASEÑA,campoConfirmarContraseña.getText().toString());
        values.put(Utilidades.USER_ID_USER,user_id_user.getText().toString());

        Long idResultante = db.insert(Utilidades.TABLA_ESTUDIANTE,Utilidades.CAMPO_DOCUMENTO,values);

        Toast.makeText(getApplicationContext(),"El usuario se ha resgistrado: "+ idResultante,Toast.LENGTH_SHORT).show();;
        db.close();
    }
}
