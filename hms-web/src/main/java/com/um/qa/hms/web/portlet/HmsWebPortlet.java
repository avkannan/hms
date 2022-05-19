package com.um.qa.hms.web.portlet;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;
import com.um.ace.qa.hms.sb.model.customer;
import com.um.ace.qa.hms.sb.service.customerLocalServiceUtil;
import com.um.qa.hms.web.constants.HmsWebPortletKeys;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.ProcessAction;

import org.osgi.service.component.annotations.Component;

/**
 * @author vadiv
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + HmsWebPortletKeys.HmsWeb,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class HmsWebPortlet extends MVCPortlet {
	private Log log = LogFactoryUtil.getLog(this.getClass().getName());

	@ProcessAction(name = "customer")
    public void checkout(ActionRequest actionRequest,ActionResponse actionResponse) {
    	String enrollmentNo = ParamUtil.getString(actionRequest, "enrollmentNo");
    	String firstName = ParamUtil.getString(actionRequest, "firstName");
    	String lastName = ParamUtil.getString(actionRequest, "lastName");
    	String contactNo = ParamUtil.getString(actionRequest, "contactNo");
    	String city = ParamUtil.getString(actionRequest, "city");
    	log.info("created");
    	customer customer = customerLocalServiceUtil.createcustomer(1);
    }
}
