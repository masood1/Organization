# Organization Structure 
Sample application of organization structure to keep trck of each desk information in Company 

Simple Spring boot project with
-JPA
-Postgress SQL

postgress code to add tables :
Total 3 tables 

1 BUILDING :

CREATE TABLE public.building
(
  building_id bigint NOT NULL DEFAULT nextval('building_building_id_seq'::regclass),
  name character varying(100) NOT NULL,
  floor smallint NOT NULL,
  CONSTRAINT building_pkey PRIMARY KEY (building_id)
)

2 FLOOR :
CREATE TABLE public.floor
(
  floor_id bigint NOT NULL,
  floornumber smallint NOT NULL,
  total_desk smallint NOT NULL,
  buildingid bigint NOT NULL,
  CONSTRAINT floor_pkey PRIMARY KEY (floor_id)
)

3 DESK

CREATE TABLE public.desk
(
  desk_id bigint NOT NULL,
  username character varying(20),
  emp_num character varying(20) NOT NULL,
  floor smallint NOT NULL,
  building_id bigint NOT NULL,
  CONSTRAINT desk_pkey PRIMARY KEY (desk_id)
)

This application do CRUD opertion ON databse : API are called throgh postman 

Fallowing API are available :
get http://localhost:8080/cisco/demoValues : will add basic values into databse for iniitial setup 

Delete http://localhost:8080/cisco/{model}/{id}
model can be 1)building 2)floor 3)desk
id is respective ID

GET http://localhost:8080/cisco/{model}/{id}
model can be 1)building 2)floor 3)desk
id is respective ID

POST http://localhost:8080/cisco/building
with fallowing json data:
{
	"id" : 452312313231,
	"name" : "b2",
	"floor": 5
} //TODO : funcationality pending 
