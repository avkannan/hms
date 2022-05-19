create index IX_86665FA9 on hms_customer (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_B624BC6B on hms_customer (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_45B2F0A6 on hms_room (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_EC6B68A8 on hms_room (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_860B0807 on hms_roomBooking (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_2CF3E449 on hms_roomBooking (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_6F1D7907 on hms_room_new (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_69EE9549 on hms_room_new (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_1F594A29 on hms_staff (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_BD046EB on hms_staff (uuid_[$COLUMN_LENGTH:75$], groupId);