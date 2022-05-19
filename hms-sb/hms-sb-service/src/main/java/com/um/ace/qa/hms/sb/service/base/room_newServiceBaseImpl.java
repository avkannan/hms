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

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.util.PortalUtil;

import com.um.ace.qa.hms.sb.model.room_new;
import com.um.ace.qa.hms.sb.service.persistence.customerPersistence;
import com.um.ace.qa.hms.sb.service.persistence.roomBookingPersistence;
import com.um.ace.qa.hms.sb.service.persistence.roomPersistence;
import com.um.ace.qa.hms.sb.service.persistence.room_newPersistence;
import com.um.ace.qa.hms.sb.service.persistence.staffPersistence;
import com.um.ace.qa.hms.sb.service.room_newService;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the room_new remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.um.ace.qa.hms.sb.service.impl.room_newServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.um.ace.qa.hms.sb.service.impl.room_newServiceImpl
 * @generated
 */
public abstract class room_newServiceBaseImpl
	extends BaseServiceImpl
	implements room_newService, AopService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>room_newService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.um.ace.qa.hms.sb.service.room_newServiceUtil</code>.
	 */
	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			room_newService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		room_newService = (room_newService)aopProxy;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return room_newService.class.getName();
	}

	protected Class<?> getModelClass() {
		return room_new.class;
	}

	protected String getModelClassName() {
		return room_new.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = room_newPersistence.getDataSource();

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
	protected customerPersistence customerPersistence;

	@Reference
	protected roomPersistence roomPersistence;

	@Reference
	protected com.um.ace.qa.hms.sb.service.room_newLocalService
		room_newLocalService;

	protected room_newService room_newService;

	@Reference
	protected room_newPersistence room_newPersistence;

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
	protected com.liferay.portal.kernel.service.ClassNameService
		classNameService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserService userService;

}