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
 * This class is a wrapper for {@link roomBooking}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see roomBooking
 * @generated
 */
@ProviderType
public class roomBookingWrapper
	extends BaseModelWrapper<roomBooking>
	implements roomBooking, ModelWrapper<roomBooking> {

	public roomBookingWrapper(roomBooking roomBooking) {
		super(roomBooking);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("bookingID", getBookingID());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("roomID", getRoomID());
		attributes.put("customerID", getCustomerID());
		attributes.put("bookId", getBookId());
		attributes.put("checkoutDate", getCheckoutDate());
		attributes.put("duration", getDuration());
		attributes.put("checkinDate", getCheckinDate());
		attributes.put("cancelledDate", getCancelledDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long bookingID = (Long)attributes.get("bookingID");

		if (bookingID != null) {
			setBookingID(bookingID);
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

		Long roomID = (Long)attributes.get("roomID");

		if (roomID != null) {
			setRoomID(roomID);
		}

		String customerID = (String)attributes.get("customerID");

		if (customerID != null) {
			setCustomerID(customerID);
		}

		Long bookId = (Long)attributes.get("bookId");

		if (bookId != null) {
			setBookId(bookId);
		}

		Date checkoutDate = (Date)attributes.get("checkoutDate");

		if (checkoutDate != null) {
			setCheckoutDate(checkoutDate);
		}

		Long duration = (Long)attributes.get("duration");

		if (duration != null) {
			setDuration(duration);
		}

		Date checkinDate = (Date)attributes.get("checkinDate");

		if (checkinDate != null) {
			setCheckinDate(checkinDate);
		}

		Date cancelledDate = (Date)attributes.get("cancelledDate");

		if (cancelledDate != null) {
			setCancelledDate(cancelledDate);
		}
	}

	/**
	 * Returns the book ID of this room booking.
	 *
	 * @return the book ID of this room booking
	 */
	@Override
	public long getBookId() {
		return model.getBookId();
	}

	/**
	 * Returns the booking ID of this room booking.
	 *
	 * @return the booking ID of this room booking
	 */
	@Override
	public long getBookingID() {
		return model.getBookingID();
	}

	/**
	 * Returns the cancelled date of this room booking.
	 *
	 * @return the cancelled date of this room booking
	 */
	@Override
	public Date getCancelledDate() {
		return model.getCancelledDate();
	}

	/**
	 * Returns the checkin date of this room booking.
	 *
	 * @return the checkin date of this room booking
	 */
	@Override
	public Date getCheckinDate() {
		return model.getCheckinDate();
	}

	/**
	 * Returns the checkout date of this room booking.
	 *
	 * @return the checkout date of this room booking
	 */
	@Override
	public Date getCheckoutDate() {
		return model.getCheckoutDate();
	}

	/**
	 * Returns the company ID of this room booking.
	 *
	 * @return the company ID of this room booking
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this room booking.
	 *
	 * @return the create date of this room booking
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the customer ID of this room booking.
	 *
	 * @return the customer ID of this room booking
	 */
	@Override
	public String getCustomerID() {
		return model.getCustomerID();
	}

	/**
	 * Returns the duration of this room booking.
	 *
	 * @return the duration of this room booking
	 */
	@Override
	public long getDuration() {
		return model.getDuration();
	}

	/**
	 * Returns the group ID of this room booking.
	 *
	 * @return the group ID of this room booking
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this room booking.
	 *
	 * @return the modified date of this room booking
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this room booking.
	 *
	 * @return the primary key of this room booking
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the room ID of this room booking.
	 *
	 * @return the room ID of this room booking
	 */
	@Override
	public long getRoomID() {
		return model.getRoomID();
	}

	/**
	 * Returns the user ID of this room booking.
	 *
	 * @return the user ID of this room booking
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this room booking.
	 *
	 * @return the user name of this room booking
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this room booking.
	 *
	 * @return the user uuid of this room booking
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this room booking.
	 *
	 * @return the uuid of this room booking
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
	 * Sets the book ID of this room booking.
	 *
	 * @param bookId the book ID of this room booking
	 */
	@Override
	public void setBookId(long bookId) {
		model.setBookId(bookId);
	}

	/**
	 * Sets the booking ID of this room booking.
	 *
	 * @param bookingID the booking ID of this room booking
	 */
	@Override
	public void setBookingID(long bookingID) {
		model.setBookingID(bookingID);
	}

	/**
	 * Sets the cancelled date of this room booking.
	 *
	 * @param cancelledDate the cancelled date of this room booking
	 */
	@Override
	public void setCancelledDate(Date cancelledDate) {
		model.setCancelledDate(cancelledDate);
	}

	/**
	 * Sets the checkin date of this room booking.
	 *
	 * @param checkinDate the checkin date of this room booking
	 */
	@Override
	public void setCheckinDate(Date checkinDate) {
		model.setCheckinDate(checkinDate);
	}

	/**
	 * Sets the checkout date of this room booking.
	 *
	 * @param checkoutDate the checkout date of this room booking
	 */
	@Override
	public void setCheckoutDate(Date checkoutDate) {
		model.setCheckoutDate(checkoutDate);
	}

	/**
	 * Sets the company ID of this room booking.
	 *
	 * @param companyId the company ID of this room booking
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this room booking.
	 *
	 * @param createDate the create date of this room booking
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the customer ID of this room booking.
	 *
	 * @param customerID the customer ID of this room booking
	 */
	@Override
	public void setCustomerID(String customerID) {
		model.setCustomerID(customerID);
	}

	/**
	 * Sets the duration of this room booking.
	 *
	 * @param duration the duration of this room booking
	 */
	@Override
	public void setDuration(long duration) {
		model.setDuration(duration);
	}

	/**
	 * Sets the group ID of this room booking.
	 *
	 * @param groupId the group ID of this room booking
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this room booking.
	 *
	 * @param modifiedDate the modified date of this room booking
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this room booking.
	 *
	 * @param primaryKey the primary key of this room booking
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the room ID of this room booking.
	 *
	 * @param roomID the room ID of this room booking
	 */
	@Override
	public void setRoomID(long roomID) {
		model.setRoomID(roomID);
	}

	/**
	 * Sets the user ID of this room booking.
	 *
	 * @param userId the user ID of this room booking
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this room booking.
	 *
	 * @param userName the user name of this room booking
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this room booking.
	 *
	 * @param userUuid the user uuid of this room booking
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this room booking.
	 *
	 * @param uuid the uuid of this room booking
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
	protected roomBookingWrapper wrap(roomBooking roomBooking) {
		return new roomBookingWrapper(roomBooking);
	}

}