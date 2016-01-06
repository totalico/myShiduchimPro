
    create table Brother (
        lngBrotherId bigint not null auto_increment,
        inAge integer,
        name varchar(255) not null,
        stFamily_name varchar(255) not null,
        stMehutanimCity varchar(255),
        stMerryTo varchar(255),
        stSchool varchar(255),
        peBroPers_PersonId bigint,
        primary key (lngBrotherId)
    );

    create table Person (
        DTYPE varchar(31) not null,
        PersonId bigint not null auto_increment,
        Father_work varchar(255),
        Fathers_name varchar(255),
        Fathers_origin varchar(255),
        High integer not null,
        IQ_lev integer not null,
        Mother_family_name varchar(255),
        Mother_work varchar(255),
        Mothers_name varchar(255),
        Mothers_origin varchar(255),
        Ortodox_lev_candidate integer not null,
        Ortodox_lev_family integer not null,
        School_name varchar(255),
        age integer not null,
        as_sf bit not null,
        beuty_lev integer not null,
        brothers_num integer not null,
        city varchar(255),
        diseases bit not null,
        family_name varchar(255) not null,
        gender varchar(255),
        name varchar(255) not null,
        neghiborhood varchar(255),
        numPhone integer not null,
        scoure integer not null,
        street varchar(255),
        primary key (PersonId)
    );

    create table User (
        User_id bigint not null auto_increment,
        dateLastLoggin varchar(255),
        dateRegist longtext,
        eMail varchar(255),
        password varchar(255),
        userName varchar(255),
        userip varchar(255),
        primary key (User_id)
    );

    create table personBer (
        PersonBerId bigint not null auto_increment,
        nameAndFamilyName varchar(255) not null,
        numPhone integer not null,
        relationToPer integer not null,
        pers_PersonId bigint,
        primary key (PersonBerId)
    );

    alter table Brother 
        add index FK6C363CA0D1B97BE9 (peBroPers_PersonId), 
        add constraint FK6C363CA0D1B97BE9 
        foreign key (peBroPers_PersonId) 
        references Person (PersonId);

    alter table personBer 
        add index FK32DA2CFAB22B4BB3 (pers_PersonId), 
        add constraint FK32DA2CFAB22B4BB3 
        foreign key (pers_PersonId) 
        references Person (PersonId);
