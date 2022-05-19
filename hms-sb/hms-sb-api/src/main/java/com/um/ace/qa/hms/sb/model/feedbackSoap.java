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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * This class is used by SOAP remote services, specifically {@link com.um.ace.qa.hms.sb.service.http.feedbackServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class feedbackSoap implements Serializable {

	public static feedbackSoap toSoapModel(feedback model) {
		feedbackSoap soapModel = new feedbackSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setRoomID(model.getRoomID());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setRoomSize(model.getRoomSize());
		soapModel.setImages(model.getImages());
		soapModel.setRoomNo(model.getRoomNo());
		soapModel.setRoomName(model.getRoomName());
		soapModel.setFacilities(model.getFacilities());
		soapModel.setFacilities2(model.getFacilities2());
		soapModel.setFacilities3(model.getFacilities3());
		soapModel.setFacilities4(model.getFacilities4());
		soapModel.setPayment(model.getPayment());
		soapModel.setCarddetails(model.getCarddetails());
		soapModel.setCvv(model.getCvv());

		return soapModel;
	}

	public static feedbackSoap[] toSoapModels(feedback[] models) {
		feedbackSoap[] soapModels = new feedbackSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static feedbackSoap[][] toSoapModels(feedback[][] models) {
		feedbackSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new feedbackSoap[models.length][models[0].length];
		}
		else {
			soapModels = new feedbackSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static feedbackSoap[] toSoapModels(List<feedback> models) {
		List<feedbackSoap> soapModels = new ArrayList<feedbackSoap>(
			models.size());

		for (feedback model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new feedbackSoap[soapModels.size()]);
	}

	public feedbackSoap() {
	}

	public long getPrimaryKey() {
		return _roomID;
	}

	public void setPrimaryKey(long pk) {
		setRoomID(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getRoomID() {
		return _roomID;
	}

	public void setRoomID(long roomID) {
		_roomID = roomID;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getRoomSize() {
		return _roomSize;
	}

	public void setRoomSize(String roomSize) {
		_roomSize = roomSize;
	}

	public String getImages() {
		return _images;
	}

	public void setImages(String images) {
		_images = images;
	}

	public long getRoomNo() {
		return _roomNo;
	}

	public void setRoomNo(long roomNo) {
		_roomNo = roomNo;
	}

	public String getRoomName() {
		return _roomName;
	}

	public void setRoomName(String roomName) {
		_roomName = roomName;
	}

	public String getFacilities() {
		return _facilities;
	}

	public void setFacilities(String facilities) {
		_facilities = facilities;
	}

	public String getFacilities2() {
		return _facilities2;
	}

	public void setFacilities2(String facilities2) {
		_facilities2 = facilities2;
	}

	public String getFacilities3() {
		return _facilities3;
	}

	public void setFacilities3(String facilities3) {
		_facilities3 = facilities3;
	}

	public String getFacilities4() {
		return _facilities4;
	}

	public void setFacilities4(String facilities4) {
		_facilities4 = facilities4;
	}

	public long getPayment() {
		return _payment;
	}

	public void setPayment(long payment) {
		_payment = payment;
	}

	public long getCarddetails() {
		return _carddetails;
	}

	public void setCarddetails(long carddetails) {
		_carddetails = carddetails;
	}

	public long getCvv() {
		return _cvv;
	}

	public void setCvv(long cvv) {
		_cvv = cvv;
	}

	private String _uuid;
	private long _roomID;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _roomSize;
	private String _images;
	private long _roomNo;
	private String _roomName;
	private String _facilities;
	private String _facilities2;
	private String _facilities3;
	private String _facilities4;
	private long _payment;
	private long _carddetails;
	private long _cvv;

}