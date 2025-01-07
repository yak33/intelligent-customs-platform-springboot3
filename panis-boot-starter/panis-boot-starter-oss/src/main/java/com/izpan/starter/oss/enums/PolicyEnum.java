/*
 * All Rights Reserved: Copyright [2024] [Zhuang Pan (paynezhuang@gmail.com)]
 * Open Source Agreement: Apache License, Version 2.0
 * For educational purposes only, commercial use shall comply with the author's copyright information.
 * The author does not guarantee or assume any responsibility for the risks of using software.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.izpan.starter.oss.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 策略枚举
 *
 * @Author payne.zhuang <paynezhuang@gmail.com>
 * @ProjectName panis-boot
 * @ClassName com.izpan.starter.oss.enums.PolicyEnum
 * @CreateTime 2024/11/25 - 17:39
 */

@Getter
@AllArgsConstructor
public enum PolicyEnum {

    /**
     * 只读
     */
    READ_ONLY("read_only", "只读"),

    /**
     * 只写
     */
    WRITE_ONLY("write_only", "只写"),

    /**
     * 读写
     */
    READ_WRITE("read_write", "读写");

    /**
     * 类型
     */
    private final String type;
    /**
     * 说明
     */
    private final String desc;

}
