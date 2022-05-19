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
 * The base model interface for the room service. Represents a row in the &quot;hms_room&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.um.ace.qa.hms.sb.model.impl.roomModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.um.ace.qa.hms.sb.model.impl.roomImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see room
 * @generated
 */
@ProviderType
public interface roomModel
	extends BaseModel<room>, GroupedModel, ShardedModel, StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a room model instance should use the {@link room} interface instead.
	 */

	/**
	 * Returns the primary key of this room.
	 *
	 * @return the primary key of this room
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this room.
	 *
	 * @param primaryKey the primary key of this room
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this room.
	 *
	 * @return the uuid of this room
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this room.
	 *
	 * @param uuid the uuid of this room
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the room ID of this room.
	 *
	 * @return the room ID of this room
	 */
	public long getRoomID();

	/**
	 * Sets the room ID of this room.
	 *
	 * @param roomID the room ID of this room
	 */
	public void setRoomID(long roomID);

	/**
	 * Returns the group ID of this room.
	 *
	 * @return the group ID of this room
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this room.
	 *
	 * @param groupId the group ID of this room
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this room.
	 *
	 * @return the company ID of this room
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this room.
	 *
	 * @param companyId the company ID of this room
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this room.
	 *
	 * @return the user ID of this room
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this room.
	 *
	 * @param userId the user ID of this room
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this room.
	 *
	 * @return the user uuid of this room
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this room.
	 *
	 * @param userUuid the user uuid of this room
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this room.
	 *
	 * @return the user name of this room
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this room.
	 *
	 * @param userName the user name of this room
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this room.
	 *
	 * @return the create date of this room
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this room.
	 *
	 * @param createDate the create date of this room
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this room.
	 *
	 * @return the modified date of this room
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this room.
	 *
	 * @param modifiedDate the modified date of this room
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the room size of this room.
	 *
	 * @return the room size of this room
	 */
	@AutoEscape
	public String getRoomSize();

	/**
	 * Sets the room size of this room.
	 *
	 * @param roomSize the room size of this room
	 */
	public void setRoomSize(String roomSize);

	/**
	 * Returns the images of this room.
	 *
	 * @return the images of this room
	 */
	@AutoEscape
	public String getImages();

	/**
	 * Sets the images of this room.
	 *
	 * @param images the images of this room
	 */
	public void setImages(String images);

	/**
	 * Returns the room no of this room.
	 *
	 * @return the room no of this room
	 */
	public long getRoomNo();

	/**
	 * Sets the room no of this room.
	 *
	 * @param roomNo the room no of this room
	 */
	public void setRoomNo(long roomNo);

	/**
	 * Returns the room name of this room.
	 *
	 * @return the room name of this room
	 */
	@AutoEscape
	public String getRoomName();

	/**
	 * Sets the room name of this room.
	 *
	 * @param roomName the room name of this room
	 */
	public void setRoomName(String roomName);

	/**
	 * Returns the facilities of this room.
	 *
	 * @return the facilities of this room
	 */
	@AutoEscape
	public String getFacilities();

	/**
	 * Sets the facilities of this room.
	 *
	 * @param facilities the facilities of this room
	 */
	public void setFacilities(String facilities);

	/**
	 * Returns the facilities2 of this room.
	 *
	 * @return the facilities2 of this room
	 */
	@AutoEscape
	public String getFacilities2();

	/**
	 * Sets the facilities2 of this room.
	 *
	 * @param facilities2 the facilities2 of this room
	 */
	public void setFacilities2(String facilities2);

	/**
	 * Returns the payment of this room.
	 *
	 * @return the payment of this room
	 */
	public long getPayment();

	/**
	 * Sets the payment of this room.
	 *
	 * @param payment the payment of this room
	 */
	public void setPayment(long payment);

	/**
	 * Returns the carddetails of this room.
	 *
	 * @return the carddetails of this room
	 */
	public long getCarddetails();

	/**
	 * Sets the carddetails of this room.
	 *
	 * @param carddetails the carddetails of this room
	 */
	public void setCarddetails(long carddetails);

	/**
	 * Returns the cvv of this room.
	 *
	 * @return the cvv of this room
	 */
	public long getCvv();

	/**
	 * Sets the cvv of this room.
	 *
	 * @param cvv the cvv of this room
	 */
	public void setCvv(long cvv);

}