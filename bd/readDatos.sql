use crudsebastian;

select numID,nombre,generoNombre as genero,ciudadNombre as ciudad from propietario p,genero g,ciudad c where p.idGenero=g.idgenero and p.idCiudad=c.idciudad;



select p.numID,p.nombre,p.idGenero,g.generoNombre,p.idCiudad from propietario p JOIN genero g ON p.idGenero=g.idgenero;

select t.numID,t.nombre,t.idGenero,t.generoNombre,t.idCiudad,c.ciudadNombre from (select p.numID,p.nombre,p.idGenero,g.generoNombre,p.idCiudad from propietario p JOIN genero g ON p.idGenero=g.idgenero)as t JOIN ciudad c ON t.idCiudad=c.idciudad order by t.numID asc;