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

package com.um.ace.qa.hms.sb.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <p>
 * This class is a wrapper for {@link room_new}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see room_new
 * @generated
 */
@ProviderType
public class room_newWrapper
	extends BaseModelWrapper<room_new>
	implements room_new, ModelWrapper<room_new> {

	public room_newWrapper(room_new room_new) {
		super(room_new);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("roomID", getRoomID());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("roomSize", getRoomSize());
		attributes.put("images", getImages());
		attributes.put("roomNo", getRoomNo());
		attributes.put("roomName", getRoomName());
		attributes.put("facilities", getFacilities());
		attributes.put("facilities2", getFacilities2());
		attributes.put("facilities3", getFacilities3());
		attributes.put("facilities4", getFacilities4());
		attributes.put("payment", getPayment());
		attributes.put("carddetails", getCarddetails());
		attributes.put("cvv", getCvv());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long roomID = (Long)attributes.get("roomID");

		if (roomID != null) {
			setRoomID(roomID);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String roomSize = (String)attributes.get("roomSize");

		if (roomSize != null) {
			setRoomSize(roomSize);
		}

		String images = (String)attributes.get("images");

		if (images != null) {
			setImages(images);
		}

		Long roomNo = (Long)attributes.get("roomNo");

		if (roomNo != null) {
			setRoomNo(roomNo);
		}

		String roomName = (String)attributes.get("roomName");

		if (roomName != null) {
			setRoomName(roomName);
		}

		String facilities = (String)attributes.get("facilities");

		if (facilities != null) {
			setFacilities(facilities);
		}

		String facilities2 = (String)attributes.get("facilities2");

		if (facilities2 != null) {
			setFacilities2(facilities2);
		}

		String facilities3 = (String)attributes.get("facilities3");

		if (facilities3 != null) {
			setFacilities3(facilities3);
		}

		String facilities4 = (String)attributes.get("facilities4");

		if (facilities4 != null) {
			setFacilities4(facilities4);
		}

		Long payment = (Long)attributes.get("payment");

		if (payment != null) {
			setPayment(payment);
		}

		Long carddetails = (Long)attributes.get("carddetails");

		if (carddetails != null) {
			setCarddetails(carddetails);
		}

		Long cvv = (Long)attributes.get("cvv");

		if (cvv != null) {
			setCvv(cvv);
		}
	}

	/**
	 * Returns the carddetails of this room_new.
	 *
	 * @return the carddetails of this room_new
	 */
	@Override
	public long getCarddetails() {
		return model.getCarddetails();
	}

	/**
	 * Returns the company ID of this room_new.
	 *
	 * @return the company ID of this room_new
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this room_new.
	 *
	 * @return the create date of this room_new
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the cvv of this room_new.
	 *
	 * @return the cvv of this room_new
	 */
	@Override
	public long getCvv() {
		return model.getCvv();
	}

	/**
	 * Returns the facilities of this room_new.
	 *
	 * @return the facilities of this room_new
	 */
	@Override
	public String getFacilities() {
		return model.getFacilities();
	}

	/**
	 * Returns the facilities2 of this room_new.
	 *
	 * @return the facilities2 of this room_new
	 */
	@Override
	public String getFacilities2() {
		return model.getFacilities2();
	}

	/**
	 * Returns the facilities3 of this room_new.
	 *
	 * @return the facilities3 of this room_new
	 */
	@Override
	public String getFacilities3() {
		return model.getFacilities3();
	}

	/**
	 * Returns the facilities4 of this room_new.
	 *
	 * @return the facilities4 of this room_new
	 */
	@Override
	public String getFacilities4() {
		return model.getFacilities4();
	}

	/**
	 * Returns the group ID of this room_new.
	 *
	 * @return the group ID of this room_new
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the images of this room_new.
	 *
	 * @return the images of this room_new
	 */
	@Override
	public String getImages() {
		return model.getImages();
	}

	/**
	 * Returns the modified date of this room_new.
	 *
	 * @return the modified date of this room_new
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the payment of this room_new.
	 *
	 * @return the payment of this room_new
	 */
	@Override
	public long getPayment() {
		return model.getPayment();
	}

	/**
	 * Returns the primary key of this room_new.
	 *
	 * @return the primary key of this room_new
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the room ID of this room_new.
	 *
	 * @return the room ID of this room_new
	 */
	@Override
	public long getRoomID() {
		return model.getRoomID();
	}

	/**
	 * Returns the room name of this room_new.
	 *
	 * @return the room name of this room_new
	 */
	@Override
	public String getRoomName() {
		return model.getRoomName();
	}

	/**
	 * Returns the room no of this room_new.
	 *
	 * @return the room no of this room_new
	 */
	@Override
	public long getRoomNo() {
		return model.getRoomNo();
	}

	/**
	 * Returns the room size of this room_new.
	 *
	 * @return the room size of this room_new
	 */
	@Override
	public String getRoomSize() {
		return model.getRoomSize();
	}

	/**
	 * Returns the user ID of this room_new.
	 *
	 * @return the user ID of this room_new
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this room_new.
	 *
	 * @return the user name of this room_new
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this room_new.
	 *
	 * @return the user uuid of this room_new
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this room_new.
	 *
	 * @return the uuid of this room_new
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the carddetails of this room_new.
	 *
	 * @param carddetails the carddetails of this room_new
	 */
	@Override
	public void setCarddetails(long carddetails) {
		model.setCarddetails(carddetails);
	}

	/**
	 * Sets the company ID of this room_new.
	 *
	 * @param companyId the company ID of this room_new
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this room_new.
	 *
	 * @param createDate the create date of this room_new
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the cvv of this room_new.
	 *
	 * @param cvv the cvv of this room_new
	 */
	@Override
	public void setCvv(long cvv) {
		model.setCvv(cvv);
	}

	/**
	 * Sets the facilities of this room_new.
	 *
	 * @param facilities the facilities of this room_new
	 */
	@Override
	public void setFacilities(String facilities) {
		model.setFacilities(facilities);
	}

	/**
	 * Sets the facilities2 of this room_new.
	 *
	 * @param facilities2 the facilities2 of this room_new
	 */
	@Override
	public void setFacilities2(String facilities2) {
		model.setFacilities2(facilities2);
	}

	/**
	 * Sets the facilities3 of this room_new.
	 *
	 * @param facilities3 the facilities3 of this room_new
	 */
	@Override
	public void setFacilities3(String facilities3) {
		model.setFacilities3(facilities3);
	}

	/**
	 * Sets the facilities4 of this room_new.
	 *
	 * @param facilities4 the facilities4 of this room_new
	 */
	@Override
	public void setFacilities4(String facilities4) {
		model.setFacilities4(facilities4);
	}

	/**
	 * Sets the group ID of this room_new.
	 *
	 * @param groupId the group ID of this room_new
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the images of this room_new.
	 *
	 * @param images the images of this room_new
	 */
	@Override
	public void setImages(String images) {
		model.setImages(images);
	}

	/**
	 * Sets the modified date of this room_new.
	 *
	 * @param modifiedDate the modified date of this room_new
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the payment of this room_new.
	 *
	 * @param payment the payment of this room_new
	 */
	@Override
	public void setPayment(long payment) {
		model.setPayment(payment);
	}

	/**
	 * Sets the primary key of this room_new.
	 *
	 * @param primaryKey the primary key of this room_new
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the room ID of this room_new.
	 *
	 * @param roomID the room ID of this room_new
	 */
	@Override
	public void setRoomID(long roomID) {
		model.setRoomID(roomID);
	}

	/**
	 * Sets the room name of this room_new.
	 *
	 * @param roomName the room name of this room_new
	 */
	@Override
	public void setRoomName(String roomName) {
		model.setRoomName(roomName);
	}

	/**
	 * Sets the room no of this room_new.
	 *
	 * @param roomNo the room no of this room_new
	 */
	@Override
	public void setRoomNo(long roomNo) {
		model.setRoomNo(roomNo);
	}

	/**
	 * Sets the room size of this room_new.
	 *
	 * @param roomSize the room size of this room_new
	 */
	@Override
	public void setRoomSize(String roomSize) {
		model.setRoomSize(roomSize);
	}

	/**
	 * Sets the user ID of this room_new.
	 *
	 * @param userId the user ID of this room_new
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this room_new.
	 *
	 * @param userName the user name of this room_new
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this room_new.
	 *
	 * @param userUuid the user uuid of this room_new
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this room_new.
	 *
	 * @param uuid the uuid of this room_new
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected room_newWrapper wrap(room_new room_new) {
		return new room_newWrapper(room_new);
	}

}