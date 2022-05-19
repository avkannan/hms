create index IX_86665FA9 on hms_customer (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_B624BC6B on hms_customer (uuid_[$COLUMN_LENGTH:75$], groupId);