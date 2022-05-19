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
 * This class is used by SOAP remote services, specifically {@link com.um.ace.qa.hms.sb.service.http.roomBookingServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class roomBookingSoap implements Serializable {

	public static roomBookingSoap toSoapModel(roomBooking model) {
		roomBookingSoap soapModel = new roomBookingSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setBookingID(model.getBookingID());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setRoomID(model.getRoomID());
		soapModel.setCustomerID(model.getCustomerID());
		soapModel.setBookId(model.getBookId());
		soapModel.setCheckoutDate(model.getCheckoutDate());
		soapModel.setDuration(model.getDuration());
		soapModel.setCheckinDate(model.getCheckinDate());
		soapModel.setCancelledDate(model.getCancelledDate());

		return soapModel;
	}

	public static roomBookingSoap[] toSoapModels(roomBooking[] models) {
		roomBookingSoap[] soapModels = new roomBookingSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static roomBookingSoap[][] toSoapModels(roomBooking[][] models) {
		roomBookingSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new roomBookingSoap[models.length][models[0].length];
		}
		else {
			soapModels = new roomBookingSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static roomBookingSoap[] toSoapModels(List<roomBooking> models) {
		List<roomBookingSoap> soapModels = new ArrayList<roomBookingSoap>(
			models.size());

		for (roomBooking model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new roomBookingSoap[soapModels.size()]);
	}

	public roomBookingSoap() {
	}

	public long getPrimaryKey() {
		return _bookingID;
	}

	public void setPrimaryKey(long pk) {
		setBookingID(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getBookingID() {
		return _bookingID;
	}

	public void setBookingID(long bookingID) {
		_bookingID = bookingID;
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

	public long getRoomID() {
		return _roomID;
	}

	public void setRoomID(long roomID) {
		_roomID = roomID;
	}

	public String getCustomerID() {
		return _customerID;
	}

	public void setCustomerID(String customerID) {
		_customerID = customerID;
	}

	public long getBookId() {
		return _bookId;
	}

	public void setBookId(long bookId) {
		_bookId = bookId;
	}

	public Date getCheckoutDate() {
		return _checkoutDate;
	}

	public void setCheckoutDate(Date checkoutDate) {
		_checkoutDate = checkoutDate;
	}

	public long getDuration() {
		return _duration;
	}

	public void setDuration(long duration) {
		_duration = duration;
	}

	public Date getCheckinDate() {
		return _checkinDate;
	}

	public void setCheckinDate(Date checkinDate) {
		_checkinDate = checkinDate;
	}

	public Date getCancelledDate() {
		return _cancelledDate;
	}

	public void setCancelledDate(Date cancelledDate) {
		_cancelledDate = cancelledDate;
	}

	private String _uuid;
	private long _bookingID;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _roomID;
	private String _customerID;
	private long _bookId;
	private Date _checkoutDate;
	private long _duration;
	private Date _checkinDate;
	private Date _cancelledDate;

}