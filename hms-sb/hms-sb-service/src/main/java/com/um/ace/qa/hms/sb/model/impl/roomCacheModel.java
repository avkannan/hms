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

import com.um.ace.qa.hms.sb.model.room;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing room in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class roomCacheModel implements CacheModel<room>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof roomCacheModel)) {
			return false;
		}

		roomCacheModel roomCacheModel = (roomCacheModel)obj;

		if (roomID == roomCacheModel.roomID) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, roomID);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", roomID=");
		sb.append(roomID);
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
		sb.append(", roomSize=");
		sb.append(roomSize);
		sb.append(", images=");
		sb.append(images);
		sb.append(", roomNo=");
		sb.append(roomNo);
		sb.append(", roomName=");
		sb.append(roomName);
		sb.append(", facilities=");
		sb.append(facilities);
		sb.append(", facilities2=");
		sb.append(facilities2);
		sb.append(", payment=");
		sb.append(payment);
		sb.append(", carddetails=");
		sb.append(carddetails);
		sb.append(", cvv=");
		sb.append(cvv);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public room toEntityModel() {
		roomImpl roomImpl = new roomImpl();

		if (uuid == null) {
			roomImpl.setUuid("");
		}
		else {
			roomImpl.setUuid(uuid);
		}

		roomImpl.setRoomID(roomID);
		roomImpl.setGroupId(groupId);
		roomImpl.setCompanyId(companyId);
		roomImpl.setUserId(userId);

		if (userName == null) {
			roomImpl.setUserName("");
		}
		else {
			roomImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			roomImpl.setCreateDate(null);
		}
		else {
			roomImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			roomImpl.setModifiedDate(null);
		}
		else {
			roomImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (roomSize == null) {
			roomImpl.setRoomSize("");
		}
		else {
			roomImpl.setRoomSize(roomSize);
		}

		if (images == null) {
			roomImpl.setImages("");
		}
		else {
			roomImpl.setImages(images);
		}

		roomImpl.setRoomNo(roomNo);

		if (roomName == null) {
			roomImpl.setRoomName("");
		}
		else {
			roomImpl.setRoomName(roomName);
		}

		if (facilities == null) {
			roomImpl.setFacilities("");
		}
		else {
			roomImpl.setFacilities(facilities);
		}

		if (facilities2 == null) {
			roomImpl.setFacilities2("");
		}
		else {
			roomImpl.setFacilities2(facilities2);
		}

		roomImpl.setPayment(payment);
		roomImpl.setCarddetails(carddetails);
		roomImpl.setCvv(cvv);

		roomImpl.resetOriginalValues();

		return roomImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		roomID = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		roomSize = objectInput.readUTF();
		images = objectInput.readUTF();

		roomNo = objectInput.readLong();
		roomName = objectInput.readUTF();
		facilities = objectInput.readUTF();
		facilities2 = objectInput.readUTF();

		payment = objectInput.readLong();

		carddetails = objectInput.readLong();

		cvv = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(roomID);

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

		if (roomSize == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(roomSize);
		}

		if (images == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(images);
		}

		objectOutput.writeLong(roomNo);

		if (roomName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(roomName);
		}

		if (facilities == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(facilities);
		}

		if (facilities2 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(facilities2);
		}

		objectOutput.writeLong(payment);

		objectOutput.writeLong(carddetails);

		objectOutput.writeLong(cvv);
	}

	public String uuid;
	public long roomID;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String roomSize;
	public String images;
	public long roomNo;
	public String roomName;
	public String facilities;
	public String facilities2;
	public long payment;
	public long carddetails;
	public long cvv;

}