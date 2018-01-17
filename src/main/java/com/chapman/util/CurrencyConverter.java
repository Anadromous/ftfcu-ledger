package com.chapman.util;

import java.text.DecimalFormat;
import java.text.ParseException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StringUtils;

/**
 * This class is converts a Double to a double-digit String (and vise-versa) by
 * BeanUtils when copying properties.
 *
 * @author <a href="mailto:pchapman@easystreet.net">Peter Chapman</a>
 */
public class CurrencyConverter {
	private final Log LOG = LogFactory.getLog(CurrencyConverter.class);
	private DecimalFormat formatter = new DecimalFormat("###,###.00");

	public void setDecimalFormatter(DecimalFormat df) {
		this.formatter = df;
	}

	/**
	 * Convert a String to a Double and a Double to a String
	 *
	 * @param type the class type to output
	 * @param value the object to convert
	 * @return object the converted object (Double or String)
	 */
	
	public Object convert(Class<Object> type, Object value) {
		// for a null value, return null
		if (value == null || StringUtils.isEmpty(value)) {
			LOG.error("Object to convert is null");
			return null;
		} else {
			if (value instanceof String) {
				try {
					if (StringUtils.isEmpty(String.valueOf(value))) {
						return null;
					}
					// formatter.setDecimalSeparatorAlwaysShown(true);
					Number num = formatter.parse(String.valueOf(value));
					return num.doubleValue();
				} catch (ParseException pe) {
					pe.printStackTrace();
				}
			} else if (value instanceof Double) {
				return formatter.format(value);
			}
		}

		throw new IllegalArgumentException("Could not convert " + value);
	}

}
