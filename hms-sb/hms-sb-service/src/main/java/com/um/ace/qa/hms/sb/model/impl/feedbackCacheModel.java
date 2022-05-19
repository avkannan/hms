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

import com.um.ace.qa.hms.sb.model.feedback;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing feedback in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class feedbackCacheModel
	implements CacheModel<feedback>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof feedbackCacheModel)) {
			return false;
		}

		feedbackCacheModel feedbackCacheModel = (feedbackCacheModel)obj;

		if (roomID == feedbackCacheModel.roomID) {
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
	public feedback toEntityModel() {
		feedbackImpl feedbackImpl = new feedbackImpl();

		if (uuid == null) {
			feedbackImpl.setUuid("");
		}
		else {
			feedbackImpl.setUuid(uuid);
		}

		feedbackImpl.setRoomID(roomID);
		feedbackImpl.setGroupId(groupId);
		feedbackImpl.setCompanyId(companyId);
		feedbackImpl.setUserId(userId);

		if (userName == null) {
			feedbackImpl.setUserName("");
		}
		else {
			feedbackImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			feedbackImpl.setCreateDate(null);
		}
		else {
			feedbackImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			feedbackImpl.setModifiedDate(null);
		}
		else {
			feedbackImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (roomSize == null) {
			feedbackImpl.setRoomSize("");
		}
		else {
			feedbackImpl.setRoomSize(roomSize);
		}

		if (images == null) {
			feedbackImpl.setImages("");
		}
		else {
			feedbackImpl.setImages(images);
		}

		feedbackImpl.setRoomNo(roomNo);

		if (roomName == null) {
			feedbackImpl.setRoomName("");
		}
		else {
			feedbackImpl.setRoomName(roomName);
		}

		if (facilities == null) {
			feedbackImpl.setFacilities("");
		}
		else {
			feedbackImpl.setFacilities(facilities);
		}

		if (facilities2 == null) {
			feedbackImpl.setFacilities2("");
		}
		else {
			feedbackImpl.setFacilities2(facilities2);
		}

		if (facilities3 == null) {
			feedbackImpl.setFacilities3("");
		}
		else {
			feedbackImpl.setFacilities3(facilities3);
		}

		if (facilities4 == null) {
			feedbackImpl.setFacilities4("");
		}
		else {
			feedbackImpl.setFacilities4(facilities4);
		}

		feedbackImpl.setPayment(payment);
		feedbackImpl.setCarddetails(carddetails);
		feedbackImpl.setCvv(cvv);

		feedbackImpl.resetOriginalValues();

		return feedbackImpl;
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