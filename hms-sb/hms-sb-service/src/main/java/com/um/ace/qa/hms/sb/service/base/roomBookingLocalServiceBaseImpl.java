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

package com.um.ace.qa.hms.sb.service.base;

import com.liferay.exportimport.kernel.lar.ExportImportHelperUtil;
import com.liferay.exportimport.kernel.lar.ManifestSummary;
import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;

import com.um.ace.qa.hms.sb.model.roomBooking;
import com.um.ace.qa.hms.sb.service.persistence.addressPersistence;
import com.um.ace.qa.hms.sb.service.persistence.customerPersistence;
import com.um.ace.qa.hms.sb.service.persistence.feedbackPersistence;
import com.um.ace.qa.hms.sb.service.persistence.imagePersistence;
import com.um.ace.qa.hms.sb.service.persistence.roomBookingPersistence;
import com.um.ace.qa.hms.sb.service.persistence.roomPersistence;
import com.um.ace.qa.hms.sb.service.persistence.room_newPersistence;
import com.um.ace.qa.hms.sb.service.persistence.staffPersistence;
import com.um.ace.qa.hms.sb.service.roomBookingLocalService;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the room booking local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.um.ace.qa.hms.sb.service.impl.roomBookingLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.um.ace.qa.hms.sb.service.impl.roomBookingLocalServiceImpl
 * @generated
 */
@ProviderType
public abstract class roomBookingLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements roomBookingLocalService, AopService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>roomBookingLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.um.ace.qa.hms.sb.service.roomBookingLocalServiceUtil</code>.
	 */

	/**
	 * Adds the room booking to the database. Also notifies the appropriate model listeners.
	 *
	 * @param roomBooking the room booking
	 * @return the room booking that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public roomBooking addroomBooking(roomBooking roomBooking) {
		roomBooking.setNew(true);

		return roomBookingPersistence.update(roomBooking);
	}

	/**
	 * Creates a new room booking with the primary key. Does not add the room booking to the database.
	 *
	 * @param bookingID the primary key for the new room booking
	 * @return the new room booking
	 */
	@Override
	@Transactional(enabled = false)
	public roomBooking createroomBooking(long bookingID) {
		return roomBookingPersistence.create(bookingID);
	}

	/**
	 * Deletes the room booking with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param bookingID the primary key of the room booking
	 * @return the room booking that was removed
	 * @throws PortalException if a room booking with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public roomBooking deleteroomBooking(long bookingID)
		throws PortalException {

		return roomBookingPersistence.remove(bookingID);
	}

	/**
	 * Deletes the room booking from the database. Also notifies the appropriate model listeners.
	 *
	 * @param roomBooking the room booking
	 * @return the room booking that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public roomBooking deleteroomBooking(roomBooking roomBooking) {
		return roomBookingPersistence.remove(roomBooking);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			roomBooking.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return roomBookingPersistence.findWithDynamicQuery(dynamicQuery);
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
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return roomBookingPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
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
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return roomBookingPersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return roomBookingPersistence.countWithDynamicQuery(dynamicQuery);
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
		DynamicQuery dynamicQuery, Projection projection) {

		return roomBookingPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public roomBooking fetchroomBooking(long bookingID) {
		return roomBookingPersistence.fetchByPrimaryKey(bookingID);
	}

	/**
	 * Returns the room booking matching the UUID and group.
	 *
	 * @param uuid the room booking's UUID
	 * @param groupId the primary key of the group
	 * @return the matching room booking, or <code>null</code> if a matching room booking could not be found
	 */
	@Override
	public roomBooking fetchroomBookingByUuidAndGroupId(
		String uuid, long groupId) {

		return roomBookingPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the room booking with the primary key.
	 *
	 * @param bookingID the primary key of the room booking
	 * @return the room booking
	 * @throws PortalException if a room booking with the primary key could not be found
	 */
	@Override
	public roomBooking getroomBooking(long bookingID) throws PortalException {
		return roomBookingPersistence.findByPrimaryKey(bookingID);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(roomBookingLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(roomBooking.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("bookingID");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			roomBookingLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(roomBooking.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("bookingID");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(roomBookingLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(roomBooking.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("bookingID");
	}

	@Override
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		final PortletDataContext portletDataContext) {

		final ExportActionableDynamicQuery exportActionableDynamicQuery =
			new ExportActionableDynamicQuery() {

				@Override
				public long performCount() throws PortalException {
					ManifestSummary manifestSummary =
						portletDataContext.getManifestSummary();

					StagedModelType stagedModelType = getStagedModelType();

					long modelAdditionCount = super.performCount();

					manifestSummary.addModelAdditionCount(
						stagedModelType, modelAdditionCount);

					long modelDeletionCount =
						ExportImportHelperUtil.getModelDeletionCount(
							portletDataContext, stagedModelType);

					manifestSummary.addModelDeletionCount(
						stagedModelType, modelDeletionCount);

					return modelAdditionCount;
				}

			};

		initActionableDynamicQuery(exportActionableDynamicQuery);

		exportActionableDynamicQuery.setAddCriteriaMethod(
			new ActionableDynamicQuery.AddCriteriaMethod() {

				@Override
				public void addCriteria(DynamicQuery dynamicQuery) {
					portletDataContext.addDateRangeCriteria(
						dynamicQuery, "modifiedDate");
				}

			});

		exportActionableDynamicQuery.setCompanyId(
			portletDataContext.getCompanyId());

		exportActionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<roomBooking>() {

				@Override
				public void performAction(roomBooking roomBooking)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, roomBooking);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(roomBooking.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return roomBookingLocalService.deleteroomBooking(
			(roomBooking)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return roomBookingPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the room bookings matching the UUID and company.
	 *
	 * @param uuid the UUID of the room bookings
	 * @param companyId the primary key of the company
	 * @return the matching room bookings, or an empty list if no matches were found
	 */
	@Override
	public List<roomBooking> getroomBookingsByUuidAndCompanyId(
		String uuid, long companyId) {

		return roomBookingPersistence.findByUuid_C(uuid, companyId);
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
	public List<roomBooking> getroomBookingsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<roomBooking> orderByComparator) {

		return roomBookingPersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
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
	public roomBooking getroomBookingByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return roomBookingPersistence.findByUUID_G(uuid, groupId);
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
	public List<roomBooking> getroomBookings(int start, int end) {
		return roomBookingPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of room bookings.
	 *
	 * @return the number of room bookings
	 */
	@Override
	public int getroomBookingsCount() {
		return roomBookingPersistence.countAll();
	}

	/**
	 * Updates the room booking in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param roomBooking the room booking
	 * @return the room booking that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public roomBooking updateroomBooking(roomBooking roomBooking) {
		return roomBookingPersistence.update(roomBooking);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			roomBookingLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		roomBookingLocalService = (roomBookingLocalService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return roomBookingLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return roomBooking.class;
	}

	protected String getModelClassName() {
		return roomBooking.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = roomBookingPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@Reference
	protected addressPersistence addressPersistence;

	@Reference
	protected customerPersistence customerPersistence;

	@Reference
	protected feedbackPersistence feedbackPersistence;

	@Reference
	protected imagePersistence imagePersistence;

	@Reference
	protected roomPersistence roomPersistence;

	@Reference
	protected room_newPersistence room_newPersistence;

	protected roomBookingLocalService roomBookingLocalService;

	@Reference
	protected roomBookingPersistence roomBookingPersistence;

	@Reference
	protected staffPersistence staffPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

}