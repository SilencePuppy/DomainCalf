package com.silence.calf.service.command;

import com.silence.calf.service.command.cmd.GoodsInsertCommand;
import com.silence.calf.service.command.cmd.GoodsUpdateCommand;

/**
 * @author 李晓冰
 * @date 2020年06月30日
 */
public interface GoodsCmdService {
    void insertGoods(GoodsInsertCommand goodsInsertCommand);

    void updateGoods(GoodsUpdateCommand goodsUpdateCommand);
}
