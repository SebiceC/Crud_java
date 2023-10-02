use crudsebastian;

select numID,nombre,generoNombre as genero,ciudadNombre as ciudad from propietario p,genero g,ciudad c where p.idGenero=g.idgenero and p.idCiudad=c.idciudad;
