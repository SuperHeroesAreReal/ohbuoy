package io.nodaiity.ohbuoy.core.scanner

import io.nodaiity.ohbuoy.core.NodeId
import io.nodaiity.ohbuoy.core.NodePacket
import io.nodaiity.ohbuoy.core.NodeState

class ContinuityScanner {

    fun runStartupTrace(): List<NodePacket> {
        val traceId = "startup_4812"
        val timestamp = System.currentTimeMillis()

        return listOf(
            NodePacket(
                traceId = traceId,
                nodeId = NodeId.AUTH_NODE,
                state = NodeState.OK,
                message = "Auth continuity intact.",
                timestamp = timestamp
            ),
            NodePacket(
                traceId = traceId,
                nodeId = NodeId.TENANT_NODE,
                state = NodeState.OK,
                message = "Tenant continuity intact.",
                timestamp = timestamp,
                upstreamNode = NodeId.AUTH_NODE
            ),
            NodePacket(
                traceId = traceId,
                nodeId = NodeId.GOVERNANCE_NODE,
                state = NodeState.WARN,
                message = "Governance continuity degraded.",
                timestamp = timestamp,
                upstreamNode = NodeId.TENANT_NODE,
                downstreamEffect = "Governance degradation propagated downstream."
            ),
            NodePacket(
                traceId = traceId,
                nodeId = NodeId.NAVIGATION_NODE,
                state = NodeState.STOP,
                message = "Navigation continuity interrupted.",
                timestamp = timestamp,
                upstreamNode = NodeId.GOVERNANCE_NODE
            )
        )
    }
}
