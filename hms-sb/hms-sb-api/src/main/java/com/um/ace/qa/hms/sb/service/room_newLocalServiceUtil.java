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

package com.um.ace.qa.hms.sb.service;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for room_new. This utility wraps
 * <code>com.um.ace.qa.hms.sb.service.impl.room_newLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see room_newLocalService
 * @generated
 */
@ProviderType
public class room_newLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.um.ace.qa.hms.sb.service.impl.room_newLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the room_new to the database. Also notifies the appropriate model listeners.
	 *
	 * @param room_new the room_new
	 * @return the room_new that was added
	 */
	public static com.um.ace.qa.hms.sb.model.room_new addroom_new(
		com.um.ace.qa.hms.sb.model.room_new room_new) {

		return getService().addroom_new(room_new);
	}

	/**
	 * Creates a new room_new with the primary key. Does not add the room_new to the database.
	 *
	 * @param roomID the primary key for the new room_new
	 * @return the new room_new
	 */
	public static com.um.ace.qa.hms.sb.model.room_new createroom_new(
		long roomID) {

		return getService().createroom_new(roomID);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the room_new with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param roomID the primary key of the room_new
	 * @return the room_new that was removed
	 * @throws PortalException if a room_new with the primary key could not be found
	 */
	public static com.um.ace.qa.hms.sb.model.room_new deleteroom_new(
			long roomID)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteroom_new(roomID);
	}

	/**
	 * Deletes the room_new from the database. Also notifies the appropriate model listeners.
	 *
	 * @param room_new the room_new
	 * @return the room_new that was removed
	 */
	public static com.um.ace.qa.hms.sb.model.room_new deleteroom_new(
		com.um.ace.qa.hms.sb.model.room_new room_new) {

		return getService().deleteroom_new(room_new);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.um.ace.qa.hms.sb.model.impl.room_newModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.um.ace.qa.hms.sb.model.impl.room_newModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.um.ace.qa.hms.sb.model.room_new fetchroom_new(
		long roomID) {

		return getService().fetchroom_new(roomID);
	}

	/**
	 * Returns the room_new matching the UUID and group.
	 *
	 * @param uuid the room_new's UUID
	 * @param groupId the primary key of the group
	 * @return the matching room_new, or <code>null</code> if a matching room_new could not be found
	 */
	public static com.um.ace.qa.hms.sb.model.room_new
		fetchroom_newByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchroom_newByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the room_new with the primary key.
	 *
	 * @param roomID the primary key of the room_new
	 * @return the room_new
	 * @throws PortalException if a room_new with the primary key could not be found
	 */
	public static com.um.ace.qa.hms.sb.model.room_new getroom_new(long roomID)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getroom_new(roomID);
	}

	/**
	 * Returns the room_new matching the UUID and group.
	 *
	 * @param uuid the room_new's UUID
	 * @param groupId the primary key of the group
	 * @return the matching room_new
	 * @throws PortalException if a matching room_new could not be found
	 */
	public static com.um.ace.qa.hms.sb.model.room_new
			getroom_newByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getroom_newByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the room_news.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.um.ace.qa.hms.sb.model.impl.room_newModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of room_news
	 * @param end the upper bound of the range of room_news (not inclusive)
	 * @return the range of room_news
	 */
	public static java.util.List<com.um.ace.qa.hms.sb.model.room_new>
		getroom_news(int start, int end) {

		return getService().getroom_news(start, end);
	}

	/**
	 * Returns all the room_news matching the UUID and company.
	 *
	 * @param uuid the UUID of the room_news
	 * @param companyId the primary key of the company
	 * @return the matching room_news, or an empty list if no matches were found
	 */
	public static java.util.List<com.um.ace.qa.hms.sb.model.room_new>
		getroom_newsByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getroom_newsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of room_news matching the UUID and company.
	 *
	 * @param uuid the UUID of the room_news
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of room_news
	 * @param end the upper bound of the range of room_news (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching room_news, or an empty list if no matches were found
	 */
	public static java.util.List<com.um.ace.qa.hms.sb.model.room_new>
		getroom_newsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.um.ace.qa.hms.sb.model.room_new> orderByComparator) {

		return getService().getroom_newsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of room_news.
	 *
	 * @return the number of room_news
	 */
	public static int getroom_newsCount() {
		return getService().getroom_newsCount();
	}

	/**
	 * Updates the room_new in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param room_new the room_new
	 * @return the room_new that was updated
	 */
	public static com.um.ace.qa.hms.sb.model.room_new updateroom_new(
		com.um.ace.qa.hms.sb.model.room_new room_new) {

		return getService().updateroom_new(room_new);
	}

	public static room_newLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<room_newLocalService, room_newLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(room_newLocalService.class);

		ServiceTracker<room_newLocalService, room_newLocalService>
			serviceTracker =
				new ServiceTracker<room_newLocalService, room_newLocalService>(
					bundle.getBundleContext(), room_newLocalService.class,
					null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}