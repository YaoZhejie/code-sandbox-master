package com.yzj.codesandbox;

import com.yzj.codesandbox.model.ExecuteCodeRequest;
import com.yzj.codesandbox.model.ExecuteCodeResponse;
import org.springframework.stereotype.Component;

@Component
public class JavaNativeCodeSandbox extends JavaCodeSandboxTemplate{
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        return super.executeCode(executeCodeRequest);
    }
}
