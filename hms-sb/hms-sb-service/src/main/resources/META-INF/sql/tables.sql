create table hms_customer (
	uuid_ VARCHAR(75) null,
	customerID LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	firstName VARCHAR(75) null,
	middleName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	displayName VARCHAR(75) null,
	salutation VARCHAR(75) null,
	address1 VARCHAR(75) null,
	address2 VARCHAR(75) null,
	address3 LONG,
	city LONG,
	country LONG,
	state_ LONG,
	zip LONG,
	phone LONG
);

create table hms_room (
	uuid_ VARCHAR(75) null,
	roomID LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	roomSize VARCHAR(75) null,
	images VARCHAR(75) null,
	roomNo LONG,
	facilities VARCHAR(75) null
);

create table hms_roomBooking (
	uuid_ VARCHAR(75) null,
	bookingID LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	roomID LONG,
	customerID VARCHAR(75) null,
	bookId LONG,
	rent DOUBLE,
	checkoutDate DATE null,
	duration LONG,
	checkinDate DATE null,
	cancelledDate DATE null
);

create table hms_staff (
	uuid_ VARCHAR(75) null,
	staffID LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	firstName VARCHAR(75) null,
	middleName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	displayName VARCHAR(75) null,
	salutation VARCHAR(75) null,
	staffType VARCHAR(75) null,
	designation VARCHAR(75) null,
	qualifcation VARCHAR(75) null,
	experience LONG
);