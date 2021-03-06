/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.websocket;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class WebsocketComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("host", java.lang.String.class);
        map.put("port", java.lang.Integer.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("staticResources", java.lang.String.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("enableJmx", boolean.class);
        map.put("maxThreads", java.lang.Integer.class);
        map.put("minThreads", java.lang.Integer.class);
        map.put("threadPool", org.eclipse.jetty.util.thread.ThreadPool.class);
        map.put("sslContextParameters", org.apache.camel.support.jsse.SSLContextParameters.class);
        map.put("sslKeyPassword", java.lang.String.class);
        map.put("sslKeystore", java.lang.String.class);
        map.put("sslPassword", java.lang.String.class);
        map.put("useGlobalSslContextParameters", boolean.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        WebsocketComponent target = (WebsocketComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "enablejmx":
        case "enableJmx": target.setEnableJmx(property(camelContext, boolean.class, value)); return true;
        case "host": target.setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxthreads":
        case "maxThreads": target.setMaxThreads(property(camelContext, java.lang.Integer.class, value)); return true;
        case "minthreads":
        case "minThreads": target.setMinThreads(property(camelContext, java.lang.Integer.class, value)); return true;
        case "port": target.setPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "sslkeypassword":
        case "sslKeyPassword": target.setSslKeyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "sslkeystore":
        case "sslKeystore": target.setSslKeystore(property(camelContext, java.lang.String.class, value)); return true;
        case "sslpassword":
        case "sslPassword": target.setSslPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "staticresources":
        case "staticResources": target.setStaticResources(property(camelContext, java.lang.String.class, value)); return true;
        case "threadpool":
        case "threadPool": target.setThreadPool(property(camelContext, org.eclipse.jetty.util.thread.ThreadPool.class, value)); return true;
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": target.setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        WebsocketComponent target = (WebsocketComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "enablejmx":
        case "enableJmx": return target.isEnableJmx();
        case "host": return target.getHost();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maxthreads":
        case "maxThreads": return target.getMaxThreads();
        case "minthreads":
        case "minThreads": return target.getMinThreads();
        case "port": return target.getPort();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getSslContextParameters();
        case "sslkeypassword":
        case "sslKeyPassword": return target.getSslKeyPassword();
        case "sslkeystore":
        case "sslKeystore": return target.getSslKeystore();
        case "sslpassword":
        case "sslPassword": return target.getSslPassword();
        case "staticresources":
        case "staticResources": return target.getStaticResources();
        case "threadpool":
        case "threadPool": return target.getThreadPool();
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": return target.isUseGlobalSslContextParameters();
        default: return null;
        }
    }
}

