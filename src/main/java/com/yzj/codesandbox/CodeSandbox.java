package com.yzj.codesandbox;

import com.yzj.codesandbox.model.ExecuteCodeRequest;
import com.yzj.codesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
