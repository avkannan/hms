/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.um.ace.qa.hms.sb.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.um.ace.qa.hms.sb.model.roomBooking;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing roomBooking in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class roomBookingCacheModel
	implements CacheModel<roomBooking>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof roomBookingCacheModel)) {
			return false;
		}

		roomBookingCacheModel roomBookingCacheModel =
			(roomBookingCacheModel)obj;

		if (bookingID == roomBookingCacheModel.bookingID) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, bookingID);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", bookingID=");
		sb.append(bookingID);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", roomID=");
		sb.append(roomID);
		sb.append(", customerID=");
		sb.append(customerID);
		sb.append(", bookId=");
		sb.append(bookId);
		sb.append(", rent=");
		sb.append(rent);
		sb.append(", checkoutDate=");
		sb.append(checkoutDate);
		sb.append(", duration=");
		sb.append(duration);
		sb.append(", checkinDate=");
		sb.append(checkinDate);
		sb.append(", cancelledDate=");
		sb.append(cancelledDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public roomBooking toEntityModel() {
		roomBookingImpl roomBookingImpl = new roomBookingImpl();

		if (uuid == null) {
			roomBookingImpl.setUuid("");
		}
		else {
			roomBookingImpl.setUuid(uuid);
		}

		roomBookingImpl.setBookingID(bookingID);
		roomBookingImpl.setGroupId(groupId);
		roomBookingImpl.setCompanyId(companyId);
		roomBookingImpl.setUserId(userId);

		if (userName == null) {
			roomBookingImpl.setUserName("");
		}
		else {
			roomBookingImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			roomBookingImpl.setCreateDate(null);
		}
		else {
			roomBookingImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			roomBookingImpl.setModifiedDate(null);
		}
		else {
			roomBookingImpl.setModifiedDate(new Date(modifiedDate));
		}

		roomBookingImpl.setRoomID(roomID);

		if (customerID == null) {
			roomBookingImpl.setCustomerID("");
		}
		else {
			roomBookingImpl.setCustomerID(customerID);
		}

		roomBookingImpl.setBookId(bookId);
		roomBookingImpl.setRent(rent);

		if (checkoutDate == Long.MIN_VALUE) {
			roomBookingImpl.setCheckoutDate(null);
		}
		else {
			roomBookingImpl.setCheckoutDate(new Date(checkoutDate));
		}

		roomBookingImpl.setDuration(duration);

		if (checkinDate == Long.MIN_VALUE) {
			roomBookingImpl.setCheckinDate(null);
		}
		else {
			roomBookingImpl.setCheckinDate(new Date(checkinDate));
		}

		if (cancelledDate == Long.MIN_VALUE) {
			roomBookingImpl.setCancelledDate(null);
		}
		else {
			roomBookingImpl.setCancelledDate(new Date(cancelledDate));
		}

		roomBookingImpl.resetOriginalValues();

		return roomBookingImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		bookingID = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		roomID = objectInput.readLong();
		customerID = objectInput.readUTF();

		bookId = objectInput.readLong();

		rent = objectInput.readFloat();
		checkoutDate = objectInput.readLong();

		duration = objectInput.readLong();
		checkinDate = objectInput.readLong();
		cancelledDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(bookingID);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(roomID);

		if (customerID == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(customerID);
		}

		objectOutput.writeLong(bookId);

		objectOutput.writeFloat(rent);
		objectOutput.writeLong(checkoutDate);

		objectOutput.writeLong(duration);
		objectOutput.writeLong(checkinDate);
		objectOutput.writeLong(cancelledDate);
	}

	public String uuid;
	public long bookingID;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long roomID;
	public String customerID;
	public long bookId;
	public float rent;
	public long checkoutDate;
	public long duration;
	public long checkinDate;
	public long cancelledDate;

}