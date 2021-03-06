package gcp.frontpc.controller.rest.pms;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gcp.pms.service.AttributeService;

@RestController
@RequestMapping("api/pms/attribute")
public class AttributeController {
	private final Log			logger	= LogFactory.getLog(getClass());

	@Autowired
	private AttributeService attrService;


}
