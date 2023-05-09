create database machinterdb ;

use machinterdb ;

create table user (
ID int  NOT NULL AUTO_INCREMENT ,
FIRST_NAME varchar (20) ,
 LAST_NAME varchar (20) ,
 EMAIL varchar (20) ,
 addresse varchar(50),
 numeroTel varchar(50),
 PASSWORD varchar (20)  ,
 PRIMARY KEY (ID) ,
 unique key (EMAIL )
)
;

create table groupe(
id int not null auto_increment,
designation varchar(50) ,
heureSiege timestamp ,
heureDescente timestamp ,
primary key (id)
)

;

create table conseiller (
ID int  NOT NULL AUTO_INCREMENT ,
FIRST_NAME varchar (20) ,
 LAST_NAME varchar (20) ,
 EMAIL varchar (20) ,
 addresse varchar(50),
 numeroTel varchar(50),
 PASSWORD varchar (20)  ,
 allonyme varchar(44) ,
 groupeId int ,
 PRIMARY KEY (ID) ,
 unique key (EMAIL ),
 foreign key (groupeId) references groupe(id)
)
;

create table absence (
id  int not null auto_increment ,
dateAbsence TIMESTAMP DEFAULT CURRENT_TIMESTAMP ,
conseillerId int ,
primary key (id),
foreign key (conseillerId)  references  conseiller(id) on delete cascade  

)

;

create table operateur (
id int not null auto_increment,
nom varchar (20) ,
primary key (id)
    )
;

create table offre(
id int not null auto_increment,
nom varchar (20),
operateurId int ,
tarif varchar(15),
dureeMini date not null,
primary key(id),
foreign key(operateurId) references operateur(id) on delete cascade
);

create table campagne (
ID int not null auto_increment ,
dateDebut  DATETIME NOT NULL ,
dateFin  DATETIME NOT NULL ,
nature varchar (20) not null,
operateurId int ,
PRIMARY KEY (ID) ,
foreign key (operateurId) references operateur (id) on delete cascade 
)
;

create table codification (
ID int not null auto_increment ,
typeCodif varchar (20) ,
dateCodif  datetime ,
conseillerId int,
prospectId int ,
primary key (id),
foreign key (conseillerId) references conseiller(id) on delete cascade ,
foreign key (prospectId) references prospect(id) 
)
;

create table prospectus  (
ID  INT not null auto_increment ,
campagneId int  ,
conseillerId INT ,
primary key (ID),
foreign key (campagneId) references campagne(ID) on delete cascade ,
foreign key (conseillerId ) references conseiller(ID) 
)
;

create table prospect (
ID int  NOT NULL AUTO_INCREMENT ,
prenom varchar (20) ,
 nom varchar (20) ,
 mail varchar (20) ,
 addresse varchar(50),
 numeroF varchar(50),
 numeroM varchar(50),
 prospectusId int ,
 PRIMARY KEY (ID) ,
 foreign key (prospectusId) references prospectus(id)
);

create table rappel  (
ID  INT not null auto_increment ,
dateRappel datetime  ,
etatRappel tinyint,
conseillerId INT ,
typeCodif varchar (20) ,
dateCodif  datetime ,
prospectId int ,
primary key (id),
foreign key (conseillerId) references conseiller(id) on delete cascade ,
foreign key (prospectId) references prospect(id)  
)
;

create table vente  (
ID  INT not null auto_increment ,
dateVente datetime  ,
dureeEngagement int ;
etatVente tinyint,
conseillerId INT ,
typeCodif varchar (20) ,
dateCodif  datetime ,
prospectId int ,
offreId int ,
primary key (id),
foreign key (conseillerId) references conseiller(id) on delete cascade ,
foreign key (prospectId) references prospect(id) ,
foreign key (offreId) references offre(id)
)