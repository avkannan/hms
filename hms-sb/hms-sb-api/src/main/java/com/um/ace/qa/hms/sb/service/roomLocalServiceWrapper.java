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
 * Provides a wrapper for {@link roomLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see roomLocalService
 * @generated
 */
@ProviderType
public class roomLocalServiceWrapper
	implements roomLocalService, ServiceWrapper<roomLocalService> {

	public roomLocalServiceWrapper(roomLocalService roomLocalService) {
		_roomLocalService = roomLocalService;
	}

	/**
	 * Adds the room to the database. Also notifies the appropriate model listeners.
	 *
	 * @param room the room
	 * @return the room that was added
	 */
	@Override
	public com.um.ace.qa.hms.sb.model.room addroom(
		com.um.ace.qa.hms.sb.model.room room) {

		return _roomLocalService.addroom(room);
	}

	/**
	 * Creates a new room with the primary key. Does not add the room to the database.
	 *
	 * @param roomID the primary key for the new room
	 * @return the new room
	 */
	@Override
	public com.um.ace.qa.hms.sb.model.room createroom(long roomID) {
		return _roomLocalService.createroom(roomID);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _roomLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the room with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param roomID the primary key of the room
	 * @return the room that was removed
	 * @throws PortalException if a room with the primary key could not be found
	 */
	@Override
	public com.um.ace.qa.hms.sb.model.room deleteroom(long roomID)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _roomLocalService.deleteroom(roomID);
	}

	/**
	 * Deletes the room from the database. Also notifies the appropriate model listeners.
	 *
	 * @param room the room
	 * @return the room that was removed
	 */
	@Override
	public com.um.ace.qa.hms.sb.model.room deleteroom(
		com.um.ace.qa.hms.sb.model.room room) {

		return _roomLocalService.deleteroom(room);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _roomLocalService.dynamicQuery();
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

		return _roomLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.um.ace.qa.hms.sb.model.impl.roomModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _roomLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.um.ace.qa.hms.sb.model.impl.roomModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _roomLocalService.dynamicQuery(
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

		return _roomLocalService.dynamicQueryCount(dynamicQuery);
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

		return _roomLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.um.ace.qa.hms.sb.model.room fetchroom(long roomID) {
		return _roomLocalService.fetchroom(roomID);
	}

	/**
	 * Returns the room matching the UUID and group.
	 *
	 * @param uuid the room's UUID
	 * @param groupId the primary key of the group
	 * @return the matching room, or <code>null</code> if a matching room could not be found
	 */
	@Override
	public com.um.ace.qa.hms.sb.model.room fetchroomByUuidAndGroupId(
		String uuid, long groupId) {

		return _roomLocalService.fetchroomByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _roomLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _roomLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _roomLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _roomLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _roomLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the room with the primary key.
	 *
	 * @param roomID the primary key of the room
	 * @return the room
	 * @throws PortalException if a room with the primary key could not be found
	 */
	@Override
	public com.um.ace.qa.hms.sb.model.room getroom(long roomID)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _roomLocalService.getroom(roomID);
	}

	/**
	 * Returns the room matching the UUID and group.
	 *
	 * @param uuid the room's UUID
	 * @param groupId the primary key of the group
	 * @return the matching room
	 * @throws PortalException if a matching room could not be found
	 */
	@Override
	public com.um.ace.qa.hms.sb.model.room getroomByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _roomLocalService.getroomByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the rooms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.um.ace.qa.hms.sb.model.impl.roomModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of rooms
	 * @param end the upper bound of the range of rooms (not inclusive)
	 * @return the range of rooms
	 */
	@Override
	public java.util.List<com.um.ace.qa.hms.sb.model.room> getrooms(
		int start, int end) {

		return _roomLocalService.getrooms(start, end);
	}

	/**
	 * Returns all the rooms matching the UUID and company.
	 *
	 * @param uuid the UUID of the rooms
	 * @param companyId the primary key of the company
	 * @return the matching rooms, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.um.ace.qa.hms.sb.model.room>
		getroomsByUuidAndCompanyId(String uuid, long companyId) {

		return _roomLocalService.getroomsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of rooms matching the UUID and company.
	 *
	 * @param uuid the UUID of the rooms
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of rooms
	 * @param end the upper bound of the range of rooms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching rooms, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.um.ace.qa.hms.sb.model.room>
		getroomsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.um.ace.qa.hms.sb.model.room> orderByComparator) {

		return _roomLocalService.getroomsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rooms.
	 *
	 * @return the number of rooms
	 */
	@Override
	public int getroomsCount() {
		return _roomLocalService.getroomsCount();
	}

	/**
	 * Updates the room in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param room the room
	 * @return the room that was updated
	 */
	@Override
	public com.um.ace.qa.hms.sb.model.room updateroom(
		com.um.ace.qa.hms.sb.model.room room) {

		return _roomLocalService.updateroom(room);
	}

	@Override
	public roomLocalService getWrappedService() {
		return _roomLocalService;
	}

	@Override
	public void setWrappedService(roomLocalService roomLocalService) {
		_roomLocalService = roomLocalService;
	}

	private roomLocalService _roomLocalService;

}