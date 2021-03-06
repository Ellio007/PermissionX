package com.permissionx.guolindev.callback;

import com.permissionx.guolindev.ExplainScope;
import com.permissionx.guolindev.PermissionBuilder;

import java.util.List;

/**
 * Callback for {@link com.permissionx.guolindev.PermissionBuilder#onExplainRequestReason(ExplainReasonCallbackWithBeforeParam)} method.
 */
public interface ExplainReasonCallbackWithBeforeParam {

    /**
     * Called when you should explain why you need these permissions.
     * @param scope
     *          Scope to show rationale dialog.
     * @param deniedList
     *          Permissions that you should explain.
     * @param beforeRequest
     *          Indicate it's before or after permission request. Work with {@link PermissionBuilder#explainReasonBeforeRequest()}
     */
    void onExplainReason(ExplainScope scope, List<String> deniedList, boolean beforeRequest);

}
