package cn.itcast.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * SimpleTagSupport它实现了SimpleTag接口。
 *   它已经把所有的tomcat传递的数据都保存起来了！而且还提供了get方法供子类调用！
 * @author cxf
 *
 */
public class MyTag2 extends SimpleTagSupport {
	@Override
	public void doTag() throws JspException, IOException {
		this.getJspContext().getOut().print("再 Hello 一次 Tag!");
	}
}
