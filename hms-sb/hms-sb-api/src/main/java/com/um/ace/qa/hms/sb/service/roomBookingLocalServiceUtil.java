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
 * Provides the local service utility for roomBooking. This utility wraps
 * <code>com.um.ace.qa.hms.sb.service.impl.roomBookingLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see roomBookingLocalService
 * @generated
 */
@ProviderType
public class roomBookingLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.um.ace.qa.hms.sb.service.impl.roomBookingLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the room booking to the database. Also notifies the appropriate model listeners.
	 *
	 * @param roomBooking the room booking
	 * @return the room booking that was added
	 */
	public static com.um.ace.qa.hms.sb.model.roomBooking addroomBooking(
		com.um.ace.qa.hms.sb.model.roomBooking roomBooking) {

		return getService().addroomBooking(roomBooking);
	}

	/**
	 * Creates a new room booking with the primary key. Does not add the room booking to the database.
	 *
	 * @param bookingID the primary key for the new room booking
	 * @return the new room booking
	 */
	public static com.um.ace.qa.hms.sb.model.roomBooking createroomBooking(
		long bookingID) {

		return getService().createroomBooking(bookingID);
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
	 * Deletes the room booking with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bookingID the primary key of the room booking
	 * @return the room booking that was removed
	 * @throws PortalException if a room booking with the primary key could not be found
	 */
	public static com.um.ace.qa.hms.sb.model.roomBooking deleteroomBooking(
			long bookingID)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteroomBooking(bookingID);
	}

	/**
	 * Deletes the room booking from the database. Also notifies the appropriate model listeners.
	 *
	 * @param roomBooking the room booking
	 * @return the room booking that was removed
	 */
	public static com.um.ace.qa.hms.sb.model.roomBooking deleteroomBooking(
		com.um.ace.qa.hms.sb.model.roomBooking roomBooking) {

		return getService().deleteroomBooking(roomBooking);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.um.ace.qa.hms.sb.model.impl.roomBookingModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.um.ace.qa.hms.sb.model.impl.roomBookingModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static com.um.ace.qa.hms.sb.model.roomBooking fetchroomBooking(
		long bookingID) {

		return getService().fetchroomBooking(bookingID);
	}

	/**
	 * Returns the room booking matching the UUID and group.
	 *
	 * @param uuid the room booking's UUID
	 * @param groupId the primary key of the group
	 * @return the matching room booking, or <code>null</code> if a matching room booking could not be found
	 */
	public static com.um.ace.qa.hms.sb.model.roomBooking
		fetchroomBookingByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchroomBookingByUuidAndGroupId(uuid, groupId);
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
	 * Returns the room booking with the primary key.
	 *
	 * @param bookingID the primary key of the room booking
	 * @return the room booking
	 * @throws PortalException if a room booking with the primary key could not be found
	 */
	public static com.um.ace.qa.hms.sb.model.roomBooking getroomBooking(
			long bookingID)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getroomBooking(bookingID);
	}

	/**
	 * Returns the room booking matching the UUID and group.
	 *
	 * @param uuid the room booking's UUID
	 * @param groupId the primary key of the group
	 * @return the matching room booking
	 * @throws PortalException if a matching room booking could not be found
	 */
	public static com.um.ace.qa.hms.sb.model.roomBooking
			getroomBookingByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getroomBookingByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the room bookings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.um.ace.qa.hms.sb.model.impl.roomBookingModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of room bookings
	 * @param end the upper bound of the range of room bookings (not inclusive)
	 * @return the range of room bookings
	 */
	public static java.util.List<com.um.ace.qa.hms.sb.model.roomBooking>
		getroomBookings(int start, int end) {

		return getService().getroomBookings(start, end);
	}

	/**
	 * Returns all the room bookings matching the UUID and company.
	 *
	 * @param uuid the UUID of the room bookings
	 * @param companyId the primary key of the company
	 * @return the matching room bookings, or an empty list if no matches were found
	 */
	public static java.util.List<com.um.ace.qa.hms.sb.model.roomBooking>
		getroomBookingsByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getroomBookingsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of room bookings matching the UUID and company.
	 *
	 * @param uuid the UUID of the room bookings
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of room bookings
	 * @param end the upper bound of the range of room bookings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching room bookings, or an empty list if no matches were found
	 */
	public static java.util.List<com.um.ace.qa.hms.sb.model.roomBooking>
		getroomBookingsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.um.ace.qa.hms.sb.model.roomBooking> orderByComparator) {

		return getService().getroomBookingsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of room bookings.
	 *
	 * @return the number of room bookings
	 */
	public static int getroomBookingsCount() {
		return getService().getroomBookingsCount();
	}

	/**
	 * Updates the room booking in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param roomBooking the room booking
	 * @return the room booking that was updated
	 */
	public static com.um.ace.qa.hms.sb.model.roomBooking updateroomBooking(
		com.um.ace.qa.hms.sb.model.roomBooking roomBooking) {

		return getService().updateroomBooking(roomBooking);
	}

	public static roomBookingLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<roomBookingLocalService, roomBookingLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(roomBookingLocalService.class);

		ServiceTracker<roomBookingLocalService, roomBookingLocalService>
			serviceTracker =
				new ServiceTracker
					<roomBookingLocalService, roomBookingLocalService>(
						bundle.getBundleContext(),
						roomBookingLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}