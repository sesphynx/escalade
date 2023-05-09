create database cornichedb ;

use cornichedb ,

create table user (
ID int  NOT NULL AUTO_INCREMENT ,
FIRST_NAME varchar (20) ,
 LAST_NAME varchar (20) ,
 EMAIL varchar (20) ,
 PASSWORD varchar (20)  ,
 PRIMARY KEY (ID) ,
 unique key (EMAIL )
)

create table chambre (
id  int not null auto_increment ,
numero varchar (20) ,
typeLogis  varchar (20), 
surface int ,
douche tinyint ,
serviceEtage tinyint ,
tvAccess tinyint ,
wifiAccess tinyint ,
regularPhoneAccess tinyint ,
primary key (id)
)

create table suite (
id  int not null auto_increment ,
numero varchar (20) ,
typeLogis  varchar (20), 
surface int ,
douche tinyint ,
serviceEtage tinyint ,
tvAccess tinyint ,
wifiAccess tinyint ,
regularPhoneAccess tinyint ,
 pieces  int ,
jacuzzi  tinyint ,
balcon  tinyint ,
primary key (id)
)

create table hangar (
id not null auto_increment,
numero varchar (20) ,
typeLogis  varchar (20), 
surface int ,
pieces int ,
videoCablage tinyint ,
nombrePriseEcran int ,
sonoCablage  tinyint ,
amenagement tinyint , 
capacite varchar(25),
placesAssises int ,
nbreLoges  int ,
primary key (id)
    )

create table seminaire (
ID int not null auto_increment ,
DATE_EVNMT  DATE NOT NULL ,
LIEU  varchar (20) not null,
DESCRIPTIF varchar (20) not null,
ORGANISATEUR varchar ( 20 ) ,
DateFinEvnmt DATE NOT NULL ,
logisId int ,
PRIMARY KEY (ID) ,
foreign key (logisId) references logis (id) on delete cascade 
)



create table locator (
ID int not null auto_increment ,
firstName varchar (20) ,
lastName  varchar (20) ,
phone  varchar (20) ,
email varchar (20) ,
primary key (id)
)

create table reservationchambre  (
ID  INT not null auto_increment ,
createdDate DATE NOT NULL ,
startedReservationDate DATE NOT NULL ,
endReservationDate  DATE NOT NULL ,
CHECKED_IN  TINYINT(1) ,
USER_ID INT , 
CHAMBRE_ID INT ,
CREATED TIMESTAMP DEFAULT CURRENT_TIMESTAMP ,
primary key (ID),
foreign key (USER_ID) references user(ID) on delete cascade ,
foreign key (CHAMBRE_ID ) references chambre(ID) 
)