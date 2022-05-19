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

import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides a wrapper for {@link roomBookingLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see roomBookingLocalService
 * @generated
 */
@ProviderType
public class roomBookingLocalServiceWrapper
	implements roomBookingLocalService,
			   ServiceWrapper<roomBookingLocalService> {

	public roomBookingLocalServiceWrapper(
		roomBookingLocalService roomBookingLocalService) {

		_roomBookingLocalService = roomBookingLocalService;
	}

	/**
	 * Adds the room booking to the database. Also notifies the appropriate model listeners.
	 *
	 * @param roomBooking the room booking
	 * @return the room booking that was added
	 */
	@Override
	public com.um.ace.qa.hms.sb.model.roomBooking addroomBooking(
		com.um.ace.qa.hms.sb.model.roomBooking roomBooking) {

		return _roomBookingLocalService.addroomBooking(roomBooking);
	}

	/**
	 * Creates a new room booking with the primary key. Does not add the room booking to the database.
	 *
	 * @param bookingID the primary key for the new room booking
	 * @return the new room booking
	 */
	@Override
	public com.um.ace.qa.hms.sb.model.roomBooking createroomBooking(
		long bookingID) {

		return _roomBookingLocalService.createroomBooking(bookingID);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _roomBookingLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the room booking with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bookingID the primary key of the room booking
	 * @return the room booking that was removed
	 * @throws PortalException if a room booking with the primary key could not be found
	 */
	@Override
	public com.um.ace.qa.hms.sb.model.roomBooking deleteroomBooking(
			long bookingID)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _roomBookingLocalService.deleteroomBooking(bookingID);
	}

	/**
	 * Deletes the room booking from the database. Also notifies the appropriate model listeners.
	 *
	 * @param roomBooking the room booking
	 * @return the room booking that was removed
	 */
	@Override
	public com.um.ace.qa.hms.sb.model.roomBooking deleteroomBooking(
		com.um.ace.qa.hms.sb.model.roomBooking roomBooking) {

		return _roomBookingLocalService.deleteroomBooking(roomBooking);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _roomBookingLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _roomBookingLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _roomBookingLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _roomBookingLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _roomBookingLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _roomBookingLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.um.ace.qa.hms.sb.model.roomBooking fetchroomBooking(
		long bookingID) {

		return _roomBookingLocalService.fetchroomBooking(bookingID);
	}

	/**
	 * Returns the room booking matching the UUID and group.
	 *
	 * @param uuid the room booking's UUID
	 * @param groupId the primary key of the group
	 * @return the matching room booking, or <code>null</code> if a matching room booking could not be found
	 */
	@Override
	public com.um.ace.qa.hms.sb.model.roomBooking
		fetchroomBookingByUuidAndGroupId(String uuid, long groupId) {

		return _roomBookingLocalService.fetchroomBookingByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _roomBookingLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _roomBookingLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _roomBookingLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _roomBookingLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _roomBookingLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the room booking with the primary key.
	 *
	 * @param bookingID the primary key of the room booking
	 * @return the room booking
	 * @throws PortalException if a room booking with the primary key could not be found
	 */
	@Override
	public com.um.ace.qa.hms.sb.model.roomBooking getroomBooking(long bookingID)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _roomBookingLocalService.getroomBooking(bookingID);
	}

	/**
	 * Returns the room booking matching the UUID and group.
	 *
	 * @param uuid the room booking's UUID
	 * @param groupId the primary key of the group
	 * @return the matching room booking
	 * @throws PortalException if a matching room booking could not be found
	 */
	@Override
	public com.um.ace.qa.hms.sb.model.roomBooking
			getroomBookingByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _roomBookingLocalService.getroomBookingByUuidAndGroupId(
			uuid, groupId);
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
	@Override
	public java.util.List<com.um.ace.qa.hms.sb.model.roomBooking>
		getroomBookings(int start, int end) {

		return _roomBookingLocalService.getroomBookings(start, end);
	}

	/**
	 * Returns all the room bookings matching the UUID and company.
	 *
	 * @param uuid the UUID of the room bookings
	 * @param companyId the primary key of the company
	 * @return the matching room bookings, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.um.ace.qa.hms.sb.model.roomBooking>
		getroomBookingsByUuidAndCompanyId(String uuid, long companyId) {

		return _roomBookingLocalService.getroomBookingsByUuidAndCompanyId(
			uuid, companyId);
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
	@Override
	public java.util.List<com.um.ace.qa.hms.sb.model.roomBooking>
		getroomBookingsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.um.ace.qa.hms.sb.model.roomBooking> orderByComparator) {

		return _roomBookingLocalService.getroomBookingsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of room bookings.
	 *
	 * @return the number of room bookings
	 */
	@Override
	public int getroomBookingsCount() {
		return _roomBookingLocalService.getroomBookingsCount();
	}

	/**
	 * Updates the room booking in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param roomBooking the room booking
	 * @return the room booking that was updated
	 */
	@Override
	public com.um.ace.qa.hms.sb.model.roomBooking updateroomBooking(
		com.um.ace.qa.hms.sb.model.roomBooking roomBooking) {

		return _roomBookingLocalService.updateroomBooking(roomBooking);
	}

	@Override
	public roomBookingLocalService getWrappedService() {
		return _roomBookingLocalService;
	}

	@Override
	public void setWrappedService(
		roomBookingLocalService roomBookingLocalService) {

		_roomBookingLocalService = roomBookingLocalService;
	}

	private roomBookingLocalService _roomBookingLocalService;

}