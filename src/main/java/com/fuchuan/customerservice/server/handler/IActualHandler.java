package com.fuchuan.customerservice.server.handler;

import com.fuchuan.customerservice.common.ImPacket;
import org.tio.core.ChannelContext;
import org.tio.websocket.common.WsRequest;

public interface IActualHandler {
  Object handle(ImPacket _packet, WsRequest req, ChannelContext ctx) throws Exception;
}
