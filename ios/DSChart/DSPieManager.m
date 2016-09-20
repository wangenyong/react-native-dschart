//
//  DSPieManager.m
//  DSChart
//
//  Created by wangenyong on 16/9/20.
//  Copyright © 2016年 ___WANGDASHUI___. All rights reserved.
//

#import "DSPieManager.h"

@implementation DSPieManager

RCT_EXPORT_MODULE()

- (UIView *)view
{
    return [[DSPie alloc] init];
}

@end
