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

import com.um.ace.qa.hms.sb.model.room_new;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the room_new service. This utility wraps <code>com.um.ace.qa.hms.sb.service.persistence.impl.room_newPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see room_newPersistence
 * @generated
 */
@ProviderType
public class room_newUtil {

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
	public static void clearCache(room_new room_new) {
		getPersistence().clearCache(room_new);
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
	public static Map<Serializable, room_new> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<room_new> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<room_new> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<room_new> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<room_new> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static room_new update(room_new room_new) {
		return getPersistence().update(room_new);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static room_new update(
		room_new room_new, ServiceContext serviceContext) {

		return getPersistence().update(room_new, serviceContext);
	}

	/**
	 * Returns all the room_news where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching room_news
	 */
	public static List<room_new> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the room_news where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>room_newModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of room_news
	 * @param end the upper bound of the range of room_news (not inclusive)
	 * @return the range of matching room_news
	 */
	public static List<room_new> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the room_news where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>room_newModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of room_news
	 * @param end the upper bound of the range of room_news (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching room_news
	 */
	public static List<room_new> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<room_new> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the room_news where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>room_newModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of room_news
	 * @param end the upper bound of the range of room_news (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching room_news
	 */
	public static List<room_new> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<room_new> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first room_new in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching room_new
	 * @throws NoSuchroom_newException if a matching room_new could not be found
	 */
	public static room_new findByUuid_First(
			String uuid, OrderByComparator<room_new> orderByComparator)
		throws com.um.ace.qa.hms.sb.exception.NoSuchroom_newException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first room_new in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching room_new, or <code>null</code> if a matching room_new could not be found
	 */
	public static room_new fetchByUuid_First(
		String uuid, OrderByComparator<room_new> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last room_new in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching room_new
	 * @throws NoSuchroom_newException if a matching room_new could not be found
	 */
	public static room_new findByUuid_Last(
			String uuid, OrderByComparator<room_new> orderByComparator)
		throws com.um.ace.qa.hms.sb.exception.NoSuchroom_newException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last room_new in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching room_new, or <code>null</code> if a matching room_new could not be found
	 */
	public static room_new fetchByUuid_Last(
		String uuid, OrderByComparator<room_new> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the room_news before and after the current room_new in the ordered set where uuid = &#63;.
	 *
	 * @param roomID the primary key of the current room_new
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next room_new
	 * @throws NoSuchroom_newException if a room_new with the primary key could not be found
	 */
	public static room_new[] findByUuid_PrevAndNext(
			long roomID, String uuid,
			OrderByComparator<room_new> orderByComparator)
		throws com.um.ace.qa.hms.sb.exception.NoSuchroom_newException {

		return getPersistence().findByUuid_PrevAndNext(
			roomID, uuid, orderByComparator);
	}

	/**
	 * Removes all the room_news where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of room_news where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching room_news
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the room_new where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchroom_newException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching room_new
	 * @throws NoSuchroom_newException if a matching room_new could not be found
	 */
	public static room_new findByUUID_G(String uuid, long groupId)
		throws com.um.ace.qa.hms.sb.exception.NoSuchroom_newException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the room_new where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching room_new, or <code>null</code> if a matching room_new could not be found
	 */
	public static room_new fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the room_new where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching room_new, or <code>null</code> if a matching room_new could not be found
	 */
	public static room_new fetchByUUID_G(
		String uuid, long groupId, boolean retrieveFromCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	 * Removes the room_new where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the room_new that was removed
	 */
	public static room_new removeByUUID_G(String uuid, long groupId)
		throws com.um.ace.qa.hms.sb.exception.NoSuchroom_newException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of room_news where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching room_news
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the room_news where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching room_news
	 */
	public static List<room_new> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the room_news where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>room_newModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of room_news
	 * @param end the upper bound of the range of room_news (not inclusive)
	 * @return the range of matching room_news
	 */
	public static List<room_new> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the room_news where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>room_newModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of room_news
	 * @param end the upper bound of the range of room_news (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching room_news
	 */
	public static List<room_new> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<room_new> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the room_news where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>room_newModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of room_news
	 * @param end the upper bound of the range of room_news (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching room_news
	 */
	public static List<room_new> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<room_new> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Returns the first room_new in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching room_new
	 * @throws NoSuchroom_newException if a matching room_new could not be found
	 */
	public static room_new findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<room_new> orderByComparator)
		throws com.um.ace.qa.hms.sb.exception.NoSuchroom_newException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first room_new in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching room_new, or <code>null</code> if a matching room_new could not be found
	 */
	public static room_new fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<room_new> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last room_new in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching room_new
	 * @throws NoSuchroom_newException if a matching room_new could not be found
	 */
	public static room_new findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<room_new> orderByComparator)
		throws com.um.ace.qa.hms.sb.exception.NoSuchroom_newException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last room_new in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching room_new, or <code>null</code> if a matching room_new could not be found
	 */
	public static room_new fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<room_new> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the room_news before and after the current room_new in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param roomID the primary key of the current room_new
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next room_new
	 * @throws NoSuchroom_newException if a room_new with the primary key could not be found
	 */
	public static room_new[] findByUuid_C_PrevAndNext(
			long roomID, String uuid, long companyId,
			OrderByComparator<room_new> orderByComparator)
		throws com.um.ace.qa.hms.sb.exception.NoSuchroom_newException {

		return getPersistence().findByUuid_C_PrevAndNext(
			roomID, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the room_news where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of room_news where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching room_news
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Caches the room_new in the entity cache if it is enabled.
	 *
	 * @param room_new the room_new
	 */
	public static void cacheResult(room_new room_new) {
		getPersistence().cacheResult(room_new);
	}

	/**
	 * Caches the room_news in the entity cache if it is enabled.
	 *
	 * @param room_news the room_news
	 */
	public static void cacheResult(List<room_new> room_news) {
		getPersistence().cacheResult(room_news);
	}

	/**
	 * Creates a new room_new with the primary key. Does not add the room_new to the database.
	 *
	 * @param roomID the primary key for the new room_new
	 * @return the new room_new
	 */
	public static room_new create(long roomID) {
		return getPersistence().create(roomID);
	}

	/**
	 * Removes the room_new with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param roomID the primary key of the room_new
	 * @return the room_new that was removed
	 * @throws NoSuchroom_newException if a room_new with the primary key could not be found
	 */
	public static room_new remove(long roomID)
		throws com.um.ace.qa.hms.sb.exception.NoSuchroom_newException {

		return getPersistence().remove(roomID);
	}

	public static room_new updateImpl(room_new room_new) {
		return getPersistence().updateImpl(room_new);
	}

	/**
	 * Returns the room_new with the primary key or throws a <code>NoSuchroom_newException</code> if it could not be found.
	 *
	 * @param roomID the primary key of the room_new
	 * @return the room_new
	 * @throws NoSuchroom_newException if a room_new with the primary key could not be found
	 */
	public static room_new findByPrimaryKey(long roomID)
		throws com.um.ace.qa.hms.sb.exception.NoSuchroom_newException {

		return getPersistence().findByPrimaryKey(roomID);
	}

	/**
	 * Returns the room_new with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param roomID the primary key of the room_new
	 * @return the room_new, or <code>null</code> if a room_new with the primary key could not be found
	 */
	public static room_new fetchByPrimaryKey(long roomID) {
		return getPersistence().fetchByPrimaryKey(roomID);
	}

	/**
	 * Returns all the room_news.
	 *
	 * @return the room_news
	 */
	public static List<room_new> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the room_news.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>room_newModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of room_news
	 * @param end the upper bound of the range of room_news (not inclusive)
	 * @return the range of room_news
	 */
	public static List<room_new> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the room_news.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>room_newModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of room_news
	 * @param end the upper bound of the range of room_news (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of room_news
	 */
	public static List<room_new> findAll(
		int start, int end, OrderByComparator<room_new> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the room_news.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>room_newModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of room_news
	 * @param end the upper bound of the range of room_news (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of room_news
	 */
	public static List<room_new> findAll(
		int start, int end, OrderByComparator<room_new> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Removes all the room_news from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of room_news.
	 *
	 * @return the number of room_news
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static room_newPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<room_newPersistence, room_newPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(room_newPersistence.class);

		ServiceTracker<room_newPersistence, room_newPersistence>
			serviceTracker =
				new ServiceTracker<room_newPersistence, room_newPersistence>(
					bundle.getBundleContext(), room_newPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}