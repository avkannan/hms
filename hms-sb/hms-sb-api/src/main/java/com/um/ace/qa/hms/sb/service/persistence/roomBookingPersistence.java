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

package com.um.ace.qa.hms.sb.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.um.ace.qa.hms.sb.exception.NoSuchroomBookingException;
import com.um.ace.qa.hms.sb.model.roomBooking;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the room booking service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see roomBookingUtil
 * @generated
 */
@ProviderType
public interface roomBookingPersistence extends BasePersistence<roomBooking> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link roomBookingUtil} to access the room booking persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the room bookings where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching room bookings
	 */
	public java.util.List<roomBooking> findByUuid(String uuid);

	/**
	 * Returns a range of all the room bookings where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>roomBookingModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of room bookings
	 * @param end the upper bound of the range of room bookings (not inclusive)
	 * @return the range of matching room bookings
	 */
	public java.util.List<roomBooking> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the room bookings where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>roomBookingModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of room bookings
	 * @param end the upper bound of the range of room bookings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching room bookings
	 */
	public java.util.List<roomBooking> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<roomBooking>
			orderByComparator);

	/**
	 * Returns an ordered range of all the room bookings where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>roomBookingModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of room bookings
	 * @param end the upper bound of the range of room bookings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching room bookings
	 */
	public java.util.List<roomBooking> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<roomBooking>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first room booking in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching room booking
	 * @throws NoSuchroomBookingException if a matching room booking could not be found
	 */
	public roomBooking findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<roomBooking>
				orderByComparator)
		throws NoSuchroomBookingException;

	/**
	 * Returns the first room booking in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching room booking, or <code>null</code> if a matching room booking could not be found
	 */
	public roomBooking fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<roomBooking>
			orderByComparator);

	/**
	 * Returns the last room booking in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching room booking
	 * @throws NoSuchroomBookingException if a matching room booking could not be found
	 */
	public roomBooking findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<roomBooking>
				orderByComparator)
		throws NoSuchroomBookingException;

	/**
	 * Returns the last room booking in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching room booking, or <code>null</code> if a matching room booking could not be found
	 */
	public roomBooking fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<roomBooking>
			orderByComparator);

	/**
	 * Returns the room bookings before and after the current room booking in the ordered set where uuid = &#63;.
	 *
	 * @param bookingID the primary key of the current room booking
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next room booking
	 * @throws NoSuchroomBookingException if a room booking with the primary key could not be found
	 */
	public roomBooking[] findByUuid_PrevAndNext(
			long bookingID, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<roomBooking>
				orderByComparator)
		throws NoSuchroomBookingException;

	/**
	 * Removes all the room bookings where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of room bookings where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching room bookings
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the room booking where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchroomBookingException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching room booking
	 * @throws NoSuchroomBookingException if a matching room booking could not be found
	 */
	public roomBooking findByUUID_G(String uuid, long groupId)
		throws NoSuchroomBookingException;

	/**
	 * Returns the room booking where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching room booking, or <code>null</code> if a matching room booking could not be found
	 */
	public roomBooking fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the room booking where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching room booking, or <code>null</code> if a matching room booking could not be found
	 */
	public roomBooking fetchByUUID_G(
		String uuid, long groupId, boolean retrieveFromCache);

	/**
	 * Removes the room booking where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the room booking that was removed
	 */
	public roomBooking removeByUUID_G(String uuid, long groupId)
		throws NoSuchroomBookingException;

	/**
	 * Returns the number of room bookings where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching room bookings
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the room bookings where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching room bookings
	 */
	public java.util.List<roomBooking> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the room bookings where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>roomBookingModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of room bookings
	 * @param end the upper bound of the range of room bookings (not inclusive)
	 * @return the range of matching room bookings
	 */
	public java.util.List<roomBooking> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the room bookings where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>roomBookingModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of room bookings
	 * @param end the upper bound of the range of room bookings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching room bookings
	 */
	public java.util.List<roomBooking> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<roomBooking>
			orderByComparator);

	/**
	 * Returns an ordered range of all the room bookings where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>roomBookingModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of room bookings
	 * @param end the upper bound of the range of room bookings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching room bookings
	 */
	public java.util.List<roomBooking> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<roomBooking>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first room booking in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching room booking
	 * @throws NoSuchroomBookingException if a matching room booking could not be found
	 */
	public roomBooking findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<roomBooking>
				orderByComparator)
		throws NoSuchroomBookingException;

	/**
	 * Returns the first room booking in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching room booking, or <code>null</code> if a matching room booking could not be found
	 */
	public roomBooking fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<roomBooking>
			orderByComparator);

	/**
	 * Returns the last room booking in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching room booking
	 * @throws NoSuchroomBookingException if a matching room booking could not be found
	 */
	public roomBooking findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<roomBooking>
				orderByComparator)
		throws NoSuchroomBookingException;

	/**
	 * Returns the last room booking in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching room booking, or <code>null</code> if a matching room booking could not be found
	 */
	public roomBooking fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<roomBooking>
			orderByComparator);

	/**
	 * Returns the room bookings before and after the current room booking in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param bookingID the primary key of the current room booking
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next room booking
	 * @throws NoSuchroomBookingException if a room booking with the primary key could not be found
	 */
	public roomBooking[] findByUuid_C_PrevAndNext(
			long bookingID, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<roomBooking>
				orderByComparator)
		throws NoSuchroomBookingException;

	/**
	 * Removes all the room bookings where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of room bookings where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching room bookings
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the room booking in the entity cache if it is enabled.
	 *
	 * @param roomBooking the room booking
	 */
	public void cacheResult(roomBooking roomBooking);

	/**
	 * Caches the room bookings in the entity cache if it is enabled.
	 *
	 * @param roomBookings the room bookings
	 */
	public void cacheResult(java.util.List<roomBooking> roomBookings);

	/**
	 * Creates a new room booking with the primary key. Does not add the room booking to the database.
	 *
	 * @param bookingID the primary key for the new room booking
	 * @return the new room booking
	 */
	public roomBooking create(long bookingID);

	/**
	 * Removes the room booking with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bookingID the primary key of the room booking
	 * @return the room booking that was removed
	 * @throws NoSuchroomBookingException if a room booking with the primary key could not be found
	 */
	public roomBooking remove(long bookingID) throws NoSuchroomBookingException;

	public roomBooking updateImpl(roomBooking roomBooking);

	/**
	 * Returns the room booking with the primary key or throws a <code>NoSuchroomBookingException</code> if it could not be found.
	 *
	 * @param bookingID the primary key of the room booking
	 * @return the room booking
	 * @throws NoSuchroomBookingException if a room booking with the primary key could not be found
	 */
	public roomBooking findByPrimaryKey(long bookingID)
		throws NoSuchroomBookingException;

	/**
	 * Returns the room booking with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bookingID the primary key of the room booking
	 * @return the room booking, or <code>null</code> if a room booking with the primary key could not be found
	 */
	public roomBooking fetchByPrimaryKey(long bookingID);

	/**
	 * Returns all the room bookings.
	 *
	 * @return the room bookings
	 */
	public java.util.List<roomBooking> findAll();

	/**
	 * Returns a range of all the room bookings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>roomBookingModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of room bookings
	 * @param end the upper bound of the range of room bookings (not inclusive)
	 * @return the range of room bookings
	 */
	public java.util.List<roomBooking> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the room bookings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>roomBookingModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of room bookings
	 * @param end the upper bound of the range of room bookings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of room bookings
	 */
	public java.util.List<roomBooking> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<roomBooking>
			orderByComparator);

	/**
	 * Returns an ordered range of all the room bookings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>roomBookingModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of room bookings
	 * @param end the upper bound of the range of room bookings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of room bookings
	 */
	public java.util.List<roomBooking> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<roomBooking>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Removes all the room bookings from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of room bookings.
	 *
	 * @return the number of room bookings
	 */
	public int countAll();

}