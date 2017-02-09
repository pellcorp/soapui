package com.eviware.soapui.impl.wsdl.support.http;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Arrays;
import java.util.List;

public class DirectProxySelector extends ProxySelector {
	public static final DirectProxySelector DIRECT = new DirectProxySelector();
	
	private static final List<Proxy> NO_PROXY_LIST = Arrays.asList(Proxy.NO_PROXY);

	@Override
	public List<Proxy> select(URI uri) {
		return NO_PROXY_LIST;
	}

	@Override
	public void connectFailed(URI uri, SocketAddress sa, IOException ioe) {
	}
}
