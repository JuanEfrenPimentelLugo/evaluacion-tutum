# evaluacion-tutum
Ejercicio para la evaluación Tutum

URL de prueba para el API REST

POST https://www.jie.mx/escuela/calificaciones/guardar

ejemplo de body:
{"idTMaterias":1,"idTUsuarios":1,"fechaRegistro":"2023-02-24","calificacion":5.7}

GET https://www.jie.mx/escuela/calificaciones/listar

ejemplo de resultado:

[
    {
        "idTCalificaciones": 1,
        "calificacion": 10.00,
        "fechaRegistro": "2017-10-10",
        "idTUsuarios": 1,
        "idTMaterias": 2,
        "talumno": {
            "idTUsuarios": 1,
            "activo": 1,
            "apMaterno": "Down",
            "apPaterno": "Dow",
            "nombre": "John"
        },
        "tmateria": {
            "idTMaterias": 2,
            "activo": 1,
            "nombre": "programacion I"
        }
    }
]
