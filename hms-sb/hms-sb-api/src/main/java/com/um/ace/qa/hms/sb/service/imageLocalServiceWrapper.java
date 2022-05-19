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
 * Provides a wrapper for {@link imageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see imageLocalService
 * @generated
 */
@ProviderType
public class imageLocalServiceWrapper
	implements imageLocalService, ServiceWrapper<imageLocalService> {

	public imageLocalServiceWrapper(imageLocalService imageLocalService) {
		_imageLocalService = imageLocalService;
	}

	/**
	 * Adds the image to the database. Also notifies the appropriate model listeners.
	 *
	 * @param image the image
	 * @return the image that was added
	 */
	@Override
	public com.um.ace.qa.hms.sb.model.image addimage(
		com.um.ace.qa.hms.sb.model.image image) {

		return _imageLocalService.addimage(image);
	}

	/**
	 * Creates a new image with the primary key. Does not add the image to the database.
	 *
	 * @param roomID the primary key for the new image
	 * @return the new image
	 */
	@Override
	public com.um.ace.qa.hms.sb.model.image createimage(long roomID) {
		return _imageLocalService.createimage(roomID);
	}

	/**
	 * Deletes the image from the database. Also notifies the appropriate model listeners.
	 *
	 * @param image the image
	 * @return the image that was removed
	 */
	@Override
	public com.um.ace.qa.hms.sb.model.image deleteimage(
		com.um.ace.qa.hms.sb.model.image image) {

		return _imageLocalService.deleteimage(image);
	}

	/**
	 * Deletes the image with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param roomID the primary key of the image
	 * @return the image that was removed
	 * @throws PortalException if a image with the primary key could not be found
	 */
	@Override
	public com.um.ace.qa.hms.sb.model.image deleteimage(long roomID)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _imageLocalService.deleteimage(roomID);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _imageLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _imageLocalService.dynamicQuery();
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

		return _imageLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.um.ace.qa.hms.sb.model.impl.imageModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _imageLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.um.ace.qa.hms.sb.model.impl.imageModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

		return _imageLocalService.dynamicQuery(
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

		return _imageLocalService.dynamicQueryCount(dynamicQuery);
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

		return _imageLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.um.ace.qa.hms.sb.model.image fetchimage(long roomID) {
		return _imageLocalService.fetchimage(roomID);
	}

	/**
	 * Returns the image matching the UUID and group.
	 *
	 * @param uuid the image's UUID
	 * @param groupId the primary key of the group
	 * @return the matching image, or <code>null</code> if a matching image could not be found
	 */
	@Override
	public com.um.ace.qa.hms.sb.model.image fetchimageByUuidAndGroupId(
		String uuid, long groupId) {

		return _imageLocalService.fetchimageByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _imageLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _imageLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	/**
	 * Returns the image with the primary key.
	 *
	 * @param roomID the primary key of the image
	 * @return the image
	 * @throws PortalException if a image with the primary key could not be found
	 */
	@Override
	public com.um.ace.qa.hms.sb.model.image getimage(long roomID)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _imageLocalService.getimage(roomID);
	}

	/**
	 * Returns the image matching the UUID and group.
	 *
	 * @param uuid the image's UUID
	 * @param groupId the primary key of the group
	 * @return the matching image
	 * @throws PortalException if a matching image could not be found
	 */
	@Override
	public com.um.ace.qa.hms.sb.model.image getimageByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _imageLocalService.getimageByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the images.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.um.ace.qa.hms.sb.model.impl.imageModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of images
	 * @param end the upper bound of the range of images (not inclusive)
	 * @return the range of images
	 */
	@Override
	public java.util.List<com.um.ace.qa.hms.sb.model.image> getimages(
		int start, int end) {

		return _imageLocalService.getimages(start, end);
	}

	/**
	 * Returns all the images matching the UUID and company.
	 *
	 * @param uuid the UUID of the images
	 * @param companyId the primary key of the company
	 * @return the matching images, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.um.ace.qa.hms.sb.model.image>
		getimagesByUuidAndCompanyId(String uuid, long companyId) {

		return _imageLocalService.getimagesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of images matching the UUID and company.
	 *
	 * @param uuid the UUID of the images
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of images
	 * @param end the upper bound of the range of images (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching images, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.um.ace.qa.hms.sb.model.image>
		getimagesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.um.ace.qa.hms.sb.model.image> orderByComparator) {

		return _imageLocalService.getimagesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of images.
	 *
	 * @return the number of images
	 */
	@Override
	public int getimagesCount() {
		return _imageLocalService.getimagesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _imageLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _imageLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _imageLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the image in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param image the image
	 * @return the image that was updated
	 */
	@Override
	public com.um.ace.qa.hms.sb.model.image updateimage(
		com.um.ace.qa.hms.sb.model.image image) {

		return _imageLocalService.updateimage(image);
	}

	@Override
	public imageLocalService getWrappedService() {
		return _imageLocalService;
	}

	@Override
	public void setWrappedService(imageLocalService imageLocalService) {
		_imageLocalService = imageLocalService;
	}

	private imageLocalService _imageLocalService;

}