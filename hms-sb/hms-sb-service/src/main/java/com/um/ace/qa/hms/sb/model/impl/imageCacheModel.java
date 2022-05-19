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

import com.um.ace.qa.hms.sb.model.image;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing image in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class imageCacheModel implements CacheModel<image>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof imageCacheModel)) {
			return false;
		}

		imageCacheModel imageCacheModel = (imageCacheModel)obj;

		if (roomID == imageCacheModel.roomID) {
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
		StringBundler sb = new StringBundler(39);

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
		sb.append(", facilities3=");
		sb.append(facilities3);
		sb.append(", facilities4=");
		sb.append(facilities4);
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
	public image toEntityModel() {
		imageImpl imageImpl = new imageImpl();

		if (uuid == null) {
			imageImpl.setUuid("");
		}
		else {
			imageImpl.setUuid(uuid);
		}

		imageImpl.setRoomID(roomID);
		imageImpl.setGroupId(groupId);
		imageImpl.setCompanyId(companyId);
		imageImpl.setUserId(userId);

		if (userName == null) {
			imageImpl.setUserName("");
		}
		else {
			imageImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			imageImpl.setCreateDate(null);
		}
		else {
			imageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			imageImpl.setModifiedDate(null);
		}
		else {
			imageImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (roomSize == null) {
			imageImpl.setRoomSize("");
		}
		else {
			imageImpl.setRoomSize(roomSize);
		}

		if (images == null) {
			imageImpl.setImages("");
		}
		else {
			imageImpl.setImages(images);
		}

		imageImpl.setRoomNo(roomNo);

		if (roomName == null) {
			imageImpl.setRoomName("");
		}
		else {
			imageImpl.setRoomName(roomName);
		}

		if (facilities == null) {
			imageImpl.setFacilities("");
		}
		else {
			imageImpl.setFacilities(facilities);
		}

		if (facilities2 == null) {
			imageImpl.setFacilities2("");
		}
		else {
			imageImpl.setFacilities2(facilities2);
		}

		if (facilities3 == null) {
			imageImpl.setFacilities3("");
		}
		else {
			imageImpl.setFacilities3(facilities3);
		}

		if (facilities4 == null) {
			imageImpl.setFacilities4("");
		}
		else {
			imageImpl.setFacilities4(facilities4);
		}

		imageImpl.setPayment(payment);
		imageImpl.setCarddetails(carddetails);
		imageImpl.setCvv(cvv);

		imageImpl.resetOriginalValues();

		return imageImpl;
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
		facilities3 = objectInput.readUTF();
		facilities4 = objectInput.readUTF();

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

		if (facilities3 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(facilities3);
		}

		if (facilities4 == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(facilities4);
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
	public String facilities3;
	public String facilities4;
	public long payment;
	public long carddetails;
	public long cvv;

}