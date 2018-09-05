package priv.zjay.utils;

import java.util.UUID;

public class UUIDUtils {

	/**
	 * 生成数字型的UUID
	 * @return
	 */
	public static long generate() {
		long rsp = UUID.randomUUID().getMostSignificantBits();
		return rsp < 0 ? -rsp : rsp;
	}
}
