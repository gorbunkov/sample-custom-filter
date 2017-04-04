-- begin DEMOCUSTOMFILTER_AUTHOR
create table DEMOCUSTOMFILTER_AUTHOR (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(255),
    LAST_NAME varchar(255),
    --
    primary key (ID)
)^
-- end DEMOCUSTOMFILTER_AUTHOR
-- begin DEMOCUSTOMFILTER_BOOK
create table DEMOCUSTOMFILTER_BOOK (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TITLE varchar(255),
    AUTHOR_ID varchar(36),
    --
    primary key (ID)
)^
-- end DEMOCUSTOMFILTER_BOOK
