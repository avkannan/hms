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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the roomBooking service. Represents a row in the &quot;hms_roomBooking&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.um.ace.qa.hms.sb.model.impl.roomBookingModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.um.ace.qa.hms.sb.model.impl.roomBookingImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see roomBooking
 * @generated
 */
@ProviderType
public interface roomBookingModel
	extends BaseModel<roomBooking>, GroupedModel, ShardedModel,
			StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a room booking model instance should use the {@link roomBooking} interface instead.
	 */

	/**
	 * Returns the primary key of this room booking.
	 *
	 * @return the primary key of this room booking
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this room booking.
	 *
	 * @param primaryKey the primary key of this room booking
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this room booking.
	 *
	 * @return the uuid of this room booking
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this room booking.
	 *
	 * @param uuid the uuid of this room booking
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the booking ID of this room booking.
	 *
	 * @return the booking ID of this room booking
	 */
	public long getBookingID();

	/**
	 * Sets the booking ID of this room booking.
	 *
	 * @param bookingID the booking ID of this room booking
	 */
	public void setBookingID(long bookingID);

	/**
	 * Returns the group ID of this room booking.
	 *
	 * @return the group ID of this room booking
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this room booking.
	 *
	 * @param groupId the group ID of this room booking
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this room booking.
	 *
	 * @return the company ID of this room booking
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this room booking.
	 *
	 * @param companyId the company ID of this room booking
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this room booking.
	 *
	 * @return the user ID of this room booking
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this room booking.
	 *
	 * @param userId the user ID of this room booking
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this room booking.
	 *
	 * @return the user uuid of this room booking
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this room booking.
	 *
	 * @param userUuid the user uuid of this room booking
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this room booking.
	 *
	 * @return the user name of this room booking
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this room booking.
	 *
	 * @param userName the user name of this room booking
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this room booking.
	 *
	 * @return the create date of this room booking
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this room booking.
	 *
	 * @param createDate the create date of this room booking
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this room booking.
	 *
	 * @return the modified date of this room booking
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this room booking.
	 *
	 * @param modifiedDate the modified date of this room booking
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the room ID of this room booking.
	 *
	 * @return the room ID of this room booking
	 */
	public long getRoomID();

	/**
	 * Sets the room ID of this room booking.
	 *
	 * @param roomID the room ID of this room booking
	 */
	public void setRoomID(long roomID);

	/**
	 * Returns the customer ID of this room booking.
	 *
	 * @return the customer ID of this room booking
	 */
	@AutoEscape
	public String getCustomerID();

	/**
	 * Sets the customer ID of this room booking.
	 *
	 * @param customerID the customer ID of this room booking
	 */
	public void setCustomerID(String customerID);

	/**
	 * Returns the book ID of this room booking.
	 *
	 * @return the book ID of this room booking
	 */
	public long getBookId();

	/**
	 * Sets the book ID of this room booking.
	 *
	 * @param bookId the book ID of this room booking
	 */
	public void setBookId(long bookId);

	/**
	 * Returns the checkout date of this room booking.
	 *
	 * @return the checkout date of this room booking
	 */
	public Date getCheckoutDate();

	/**
	 * Sets the checkout date of this room booking.
	 *
	 * @param checkoutDate the checkout date of this room booking
	 */
	public void setCheckoutDate(Date checkoutDate);

	/**
	 * Returns the duration of this room booking.
	 *
	 * @return the duration of this room booking
	 */
	public long getDuration();

	/**
	 * Sets the duration of this room booking.
	 *
	 * @param duration the duration of this room booking
	 */
	public void setDuration(long duration);

	/**
	 * Returns the checkin date of this room booking.
	 *
	 * @return the checkin date of this room booking
	 */
	public Date getCheckinDate();

	/**
	 * Sets the checkin date of this room booking.
	 *
	 * @param checkinDate the checkin date of this room booking
	 */
	public void setCheckinDate(Date checkinDate);

	/**
	 * Returns the cancelled date of this room booking.
	 *
	 * @return the cancelled date of this room booking
	 */
	public Date getCancelledDate();

	/**
	 * Sets the cancelled date of this room booking.
	 *
	 * @param cancelledDate the cancelled date of this room booking
	 */
	public void setCancelledDate(Date cancelledDate);

}