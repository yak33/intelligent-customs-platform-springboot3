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

package com.izpan.modules.system.domain.dto.org.units;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

/**
 * 组织/部门/子部门管理 编辑更新 DTO 对象
 *
 * @Author payne.zhuang <paynezhuang@gmail.com>
 * @ProjectName panis-boot
 * @ClassName com.izpan.modules.system.domain.dto.org.units.SysOrgUnitsUpdateDTO
 * @CreateTime 2024-07-16 - 16:35:30
 */

@Getter
@Setter
@Schema(name = "SysOrgUnitsUpdateDTO", description = "组织/部门/子部门管理 编辑更新 DTO 对象")
public class SysOrgUnitsUpdateDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = -4706858510288285807L;

    @Schema(description = "组织/部门/子部门ID")
    private Long id;

    @Schema(description = "父组织/部门/子部门ID")
    private Long parentId;

    @Schema(description = "组织/部门/子部门名称")
    private String name;

    @Schema(description = "组织/部门/子部门编码")
    private String code;

    @Schema(description = "组织/部门/子部门名称简写")
    private String abbr;

    @Schema(description = "组织/部门/子部门层级")
    private Integer level;

    @Schema(description = "祖先节点")
    private String ancestors;

    @Schema(description = "组织/部门/子部门描述")
    private String description;

    @Schema(description = "排序值")
    private Integer sort;

    @Schema(description = "是否启用(0:禁用,1:启用)")
    private String status;

}