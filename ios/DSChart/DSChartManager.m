//
//  DSChartManager.m
//  DSChart
//
//  Created by wangenyong on 16/9/18.
//  Copyright © 2016年 ___WANGDASHUI___. All rights reserved.
//

#import "DSChartManager.h"

@implementation DSChartManager

RCT_EXPORT_MODULE()

- (UIView *)view
{
    return [[DSChart alloc] init];
}

@end
