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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.um.ace.qa.hms.sb.model.roomBooking;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the room booking service. This utility wraps <code>com.um.ace.qa.hms.sb.service.persistence.impl.roomBookingPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see roomBookingPersistence
 * @generated
 */
@ProviderType
public class roomBookingUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(roomBooking roomBooking) {
		getPersistence().clearCache(roomBooking);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, roomBooking> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<roomBooking> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<roomBooking> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<roomBooking> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<roomBooking> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static roomBooking update(roomBooking roomBooking) {
		return getPersistence().update(roomBooking);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static roomBooking update(
		roomBooking roomBooking, ServiceContext serviceContext) {

		return getPersistence().update(roomBooking, serviceContext);
	}

	/**
	 * Returns all the room bookings where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching room bookings
	 */
	public static List<roomBooking> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<roomBooking> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<roomBooking> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<roomBooking> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<roomBooking> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<roomBooking> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first room booking in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching room booking
	 * @throws NoSuchroomBookingException if a matching room booking could not be found
	 */
	public static roomBooking findByUuid_First(
			String uuid, OrderByComparator<roomBooking> orderByComparator)
		throws com.um.ace.qa.hms.sb.exception.NoSuchroomBookingException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first room booking in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching room booking, or <code>null</code> if a matching room booking could not be found
	 */
	public static roomBooking fetchByUuid_First(
		String uuid, OrderByComparator<roomBooking> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last room booking in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching room booking
	 * @throws NoSuchroomBookingException if a matching room booking could not be found
	 */
	public static roomBooking findByUuid_Last(
			String uuid, OrderByComparator<roomBooking> orderByComparator)
		throws com.um.ace.qa.hms.sb.exception.NoSuchroomBookingException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last room booking in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching room booking, or <code>null</code> if a matching room booking could not be found
	 */
	public static roomBooking fetchByUuid_Last(
		String uuid, OrderByComparator<roomBooking> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the room bookings before and after the current room booking in the ordered set where uuid = &#63;.
	 *
	 * @param bookingID the primary key of the current room booking
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next room booking
	 * @throws NoSuchroomBookingException if a room booking with the primary key could not be found
	 */
	public static roomBooking[] findByUuid_PrevAndNext(
			long bookingID, String uuid,
			OrderByComparator<roomBooking> orderByComparator)
		throws com.um.ace.qa.hms.sb.exception.NoSuchroomBookingException {

		return getPersistence().findByUuid_PrevAndNext(
			bookingID, uuid, orderByComparator);
	}

	/**
	 * Removes all the room bookings where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of room bookings where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching room bookings
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the room booking where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchroomBookingException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching room booking
	 * @throws NoSuchroomBookingException if a matching room booking could not be found
	 */
	public static roomBooking findByUUID_G(String uuid, long groupId)
		throws com.um.ace.qa.hms.sb.exception.NoSuchroomBookingException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the room booking where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching room booking, or <code>null</code> if a matching room booking could not be found
	 */
	public static roomBooking fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the room booking where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching room booking, or <code>null</code> if a matching room booking could not be found
	 */
	public static roomBooking fetchByUUID_G(
		String uuid, long groupId, boolean retrieveFromCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	 * Removes the room booking where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the room booking that was removed
	 */
	public static roomBooking removeByUUID_G(String uuid, long groupId)
		throws com.um.ace.qa.hms.sb.exception.NoSuchroomBookingException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of room bookings where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching room bookings
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the room bookings where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching room bookings
	 */
	public static List<roomBooking> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

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
	public static List<roomBooking> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

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
	public static List<roomBooking> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<roomBooking> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

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
	public static List<roomBooking> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<roomBooking> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first room booking in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching room booking
	 * @throws NoSuchroomBookingException if a matching room booking could not be found
	 */
	public static roomBooking findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<roomBooking> orderByComparator)
		throws com.um.ace.qa.hms.sb.exception.NoSuchroomBookingException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first room booking in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching room booking, or <code>null</code> if a matching room booking could not be found
	 */
	public static roomBooking fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<roomBooking> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last room booking in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching room booking
	 * @throws NoSuchroomBookingException if a matching room booking could not be found
	 */
	public static roomBooking findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<roomBooking> orderByComparator)
		throws com.um.ace.qa.hms.sb.exception.NoSuchroomBookingException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last room booking in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching room booking, or <code>null</code> if a matching room booking could not be found
	 */
	public static roomBooking fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<roomBooking> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

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
	public static roomBooking[] findByUuid_C_PrevAndNext(
			long bookingID, String uuid, long companyId,
			OrderByComparator<roomBooking> orderByComparator)
		throws com.um.ace.qa.hms.sb.exception.NoSuchroomBookingException {

		return getPersistence().findByUuid_C_PrevAndNext(
			bookingID, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the room bookings where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of room bookings where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching room bookings
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Caches the room booking in the entity cache if it is enabled.
	 *
	 * @param roomBooking the room booking
	 */
	public static void cacheResult(roomBooking roomBooking) {
		getPersistence().cacheResult(roomBooking);
	}

	/**
	 * Caches the room bookings in the entity cache if it is enabled.
	 *
	 * @param roomBookings the room bookings
	 */
	public static void cacheResult(List<roomBooking> roomBookings) {
		getPersistence().cacheResult(roomBookings);
	}

	/**
	 * Creates a new room booking with the primary key. Does not add the room booking to the database.
	 *
	 * @param bookingID the primary key for the new room booking
	 * @return the new room booking
	 */
	public static roomBooking create(long bookingID) {
		return getPersistence().create(bookingID);
	}

	/**
	 * Removes the room booking with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bookingID the primary key of the room booking
	 * @return the room booking that was removed
	 * @throws NoSuchroomBookingException if a room booking with the primary key could not be found
	 */
	public static roomBooking remove(long bookingID)
		throws com.um.ace.qa.hms.sb.exception.NoSuchroomBookingException {

		return getPersistence().remove(bookingID);
	}

	public static roomBooking updateImpl(roomBooking roomBooking) {
		return getPersistence().updateImpl(roomBooking);
	}

	/**
	 * Returns the room booking with the primary key or throws a <code>NoSuchroomBookingException</code> if it could not be found.
	 *
	 * @param bookingID the primary key of the room booking
	 * @return the room booking
	 * @throws NoSuchroomBookingException if a room booking with the primary key could not be found
	 */
	public static roomBooking findByPrimaryKey(long bookingID)
		throws com.um.ace.qa.hms.sb.exception.NoSuchroomBookingException {

		return getPersistence().findByPrimaryKey(bookingID);
	}

	/**
	 * Returns the room booking with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param bookingID the primary key of the room booking
	 * @return the room booking, or <code>null</code> if a room booking with the primary key could not be found
	 */
	public static roomBooking fetchByPrimaryKey(long bookingID) {
		return getPersistence().fetchByPrimaryKey(bookingID);
	}

	/**
	 * Returns all the room bookings.
	 *
	 * @return the room bookings
	 */
	public static List<roomBooking> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<roomBooking> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<roomBooking> findAll(
		int start, int end, OrderByComparator<roomBooking> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<roomBooking> findAll(
		int start, int end, OrderByComparator<roomBooking> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Removes all the room bookings from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of room bookings.
	 *
	 * @return the number of room bookings
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static roomBookingPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<roomBookingPersistence, roomBookingPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(roomBookingPersistence.class);

		ServiceTracker<roomBookingPersistence, roomBookingPersistence>
			serviceTracker =
				new ServiceTracker
					<roomBookingPersistence, roomBookingPersistence>(
						bundle.getBundleContext(), roomBookingPersistence.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}