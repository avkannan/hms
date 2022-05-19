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

import com.um.ace.qa.hms.sb.exception.NoSuchroom_newException;
import com.um.ace.qa.hms.sb.model.room_new;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the room_new service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see room_newUtil
 * @generated
 */
@ProviderType
public interface room_newPersistence extends BasePersistence<room_new> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link room_newUtil} to access the room_new persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the room_news where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching room_news
	 */
	public java.util.List<room_new> findByUuid(String uuid);

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
	public java.util.List<room_new> findByUuid(String uuid, int start, int end);

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
	public java.util.List<room_new> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<room_new>
			orderByComparator);

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
	public java.util.List<room_new> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<room_new>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first room_new in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching room_new
	 * @throws NoSuchroom_newException if a matching room_new could not be found
	 */
	public room_new findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<room_new>
				orderByComparator)
		throws NoSuchroom_newException;

	/**
	 * Returns the first room_new in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching room_new, or <code>null</code> if a matching room_new could not be found
	 */
	public room_new fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<room_new>
			orderByComparator);

	/**
	 * Returns the last room_new in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching room_new
	 * @throws NoSuchroom_newException if a matching room_new could not be found
	 */
	public room_new findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<room_new>
				orderByComparator)
		throws NoSuchroom_newException;

	/**
	 * Returns the last room_new in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching room_new, or <code>null</code> if a matching room_new could not be found
	 */
	public room_new fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<room_new>
			orderByComparator);

	/**
	 * Returns the room_news before and after the current room_new in the ordered set where uuid = &#63;.
	 *
	 * @param roomID the primary key of the current room_new
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next room_new
	 * @throws NoSuchroom_newException if a room_new with the primary key could not be found
	 */
	public room_new[] findByUuid_PrevAndNext(
			long roomID, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<room_new>
				orderByComparator)
		throws NoSuchroom_newException;

	/**
	 * Removes all the room_news where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of room_news where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching room_news
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the room_new where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchroom_newException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching room_new
	 * @throws NoSuchroom_newException if a matching room_new could not be found
	 */
	public room_new findByUUID_G(String uuid, long groupId)
		throws NoSuchroom_newException;

	/**
	 * Returns the room_new where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching room_new, or <code>null</code> if a matching room_new could not be found
	 */
	public room_new fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the room_new where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching room_new, or <code>null</code> if a matching room_new could not be found
	 */
	public room_new fetchByUUID_G(
		String uuid, long groupId, boolean retrieveFromCache);

	/**
	 * Removes the room_new where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the room_new that was removed
	 */
	public room_new removeByUUID_G(String uuid, long groupId)
		throws NoSuchroom_newException;

	/**
	 * Returns the number of room_news where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching room_news
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the room_news where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching room_news
	 */
	public java.util.List<room_new> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<room_new> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<room_new> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<room_new>
			orderByComparator);

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
	public java.util.List<room_new> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<room_new>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Returns the first room_new in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching room_new
	 * @throws NoSuchroom_newException if a matching room_new could not be found
	 */
	public room_new findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<room_new>
				orderByComparator)
		throws NoSuchroom_newException;

	/**
	 * Returns the first room_new in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching room_new, or <code>null</code> if a matching room_new could not be found
	 */
	public room_new fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<room_new>
			orderByComparator);

	/**
	 * Returns the last room_new in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching room_new
	 * @throws NoSuchroom_newException if a matching room_new could not be found
	 */
	public room_new findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<room_new>
				orderByComparator)
		throws NoSuchroom_newException;

	/**
	 * Returns the last room_new in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching room_new, or <code>null</code> if a matching room_new could not be found
	 */
	public room_new fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<room_new>
			orderByComparator);

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
	public room_new[] findByUuid_C_PrevAndNext(
			long roomID, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<room_new>
				orderByComparator)
		throws NoSuchroom_newException;

	/**
	 * Removes all the room_news where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of room_news where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching room_news
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the room_new in the entity cache if it is enabled.
	 *
	 * @param room_new the room_new
	 */
	public void cacheResult(room_new room_new);

	/**
	 * Caches the room_news in the entity cache if it is enabled.
	 *
	 * @param room_news the room_news
	 */
	public void cacheResult(java.util.List<room_new> room_news);

	/**
	 * Creates a new room_new with the primary key. Does not add the room_new to the database.
	 *
	 * @param roomID the primary key for the new room_new
	 * @return the new room_new
	 */
	public room_new create(long roomID);

	/**
	 * Removes the room_new with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param roomID the primary key of the room_new
	 * @return the room_new that was removed
	 * @throws NoSuchroom_newException if a room_new with the primary key could not be found
	 */
	public room_new remove(long roomID) throws NoSuchroom_newException;

	public room_new updateImpl(room_new room_new);

	/**
	 * Returns the room_new with the primary key or throws a <code>NoSuchroom_newException</code> if it could not be found.
	 *
	 * @param roomID the primary key of the room_new
	 * @return the room_new
	 * @throws NoSuchroom_newException if a room_new with the primary key could not be found
	 */
	public room_new findByPrimaryKey(long roomID)
		throws NoSuchroom_newException;

	/**
	 * Returns the room_new with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param roomID the primary key of the room_new
	 * @return the room_new, or <code>null</code> if a room_new with the primary key could not be found
	 */
	public room_new fetchByPrimaryKey(long roomID);

	/**
	 * Returns all the room_news.
	 *
	 * @return the room_news
	 */
	public java.util.List<room_new> findAll();

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
	public java.util.List<room_new> findAll(int start, int end);

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
	public java.util.List<room_new> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<room_new>
			orderByComparator);

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
	public java.util.List<room_new> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<room_new>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Removes all the room_news from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of room_news.
	 *
	 * @return the number of room_news
	 */
	public int countAll();

}