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
 * Provides a wrapper for {@link imageService}.
 *
 * @author Brian Wing Shun Chan
 * @see imageService
 * @generated
 */
@ProviderType
public class imageServiceWrapper
	implements imageService, ServiceWrapper<imageService> {

	public imageServiceWrapper(imageService imageService) {
		_imageService = imageService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _imageService.getOSGiServiceIdentifier();
	}

	@Override
	public imageService getWrappedService() {
		return _imageService;
	}

	@Override
	public void setWrappedService(imageService imageService) {
		_imageService = imageService;
	}

	private imageService _imageService;

}