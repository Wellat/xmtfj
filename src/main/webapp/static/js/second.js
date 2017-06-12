var chart2 = null;

var option2 = {
    title : {
        text: '厦门市商品房交易信息',
        subtext: '数据来自厦门市国土资源与房产管理局',
        x: 'center',
        align: 'right'
    },
    grid: {
        bottom: 80
    },

    tooltip : {
        trigger: 'axis',
        axisPointer: {
            type: 'cross',
            animation: false,
            label: {
                backgroundColor: '#505765'
            }
        }
    },
    legend: {
        data:['住宅套数','总套数','住宅面积','总面积'],
        x: 'left'
    },
    dataZoom: [
        {
            show: true,
            realtime: true,
            start: 50,
            end: 100
        },
        {
            show: true,
            type: 'inside',//slide
            realtime: true,
            xAxisIndex: [0,1],
            start: 50,
            end: 100
        }
    ],
    xAxis : [
        {
            type : 'category',
            //boundaryGap : false,
            axisLine: {onZero: false}
        },
        {
            type : 'category',
            axisLine: {show:false},
            axisTick: {show:false},
            axisLabel: {show:false},
            splitArea: {show:false},
            splitLine: {show:false},
            //axisLine: {onZero: false}
        }
    ],
    yAxis: [
        {
            name: '套数(套)',
            type: 'value',
            scale:true,
            boundaryGap: [0.01, 0.01]
        },
        {
            name: '面积(M2)',
            type: 'value',
            scale:true,
            boundaryGap: [0.01, 0.01]
        }
    ],

    series: [
        {
            name:'总套数',
            type:'bar',
            itemStyle: {normal: {color:'#81c0c0',label:{show:true},barBorderRadius:5}}
        },
        {
            name:'住宅套数',
            type:'bar',
            xAxisIndex:1,
            itemStyle: {normal: {color:'#408080',label:{show:true},barBorderRadius:5}}
        },

        {
            name:'总面积',
            type:'bar',
            itemStyle: {normal: {color:'#ffbb77',label:{show:true},barBorderRadius:5}},
            yAxisIndex:1

        },
        {
            name:'住宅面积',
            type:'bar',
            itemStyle: {normal: {color:'#ea7500', label:{show:true},barBorderRadius:5}},
            yAxisIndex:1,
            xAxisIndex:1,
        },{
            name: 'GDP占比',
            type: 'pie',
            center: ['80%', '20%'],
            radius: '28%',
            z: 100
        }
    ]

};

function test1(msg) {
    if (msg != '同安区') {
        chart2.setOption({
            xAxis : [
                {
                    data : ['2009/10/1 0:00', '2009/10/1 1:00', '2009/10/1 2:00', '2009/10/1 3:00', '2009/10/1 4:00', '2009/10/1 5:00', '2009/10/1 6:00', '2009/10/1 7:00', '2009/10/1 8:00', '2009/10/1 9:00']
                },
                {
                    data : ['2009/10/1 0:00', '2009/10/1 1:00', '2009/10/1 2:00', '2009/10/1 3:00', '2009/10/1 4:00', '2009/10/1 5:00', '2009/10/1 6:00', '2009/10/1 7:00', '2009/10/1 8:00', '2009/10/1 9:00']
                }
            ],
            series: [
                {
                    name:'住宅套数',
                    data: [
                        57, 36, 126, 105, 165, 114, 54, 124, 104, 64
                    ]
                },
                {
                    name:'总套数',
                    data: [
                        97, 76, 146, 115, 215, 134, 74, 194, 124, 94
                    ]
                },
                {
                    name:'总面积',
                    data: [
                        397, 336, 446, 415, 465, 434, 374, 494, 424, 334
                    ]
                },
                {
                    name:'住宅面积',
                    data: [
                        297, 306, 416, 315, 435, 394, 274, 404, 404, 304
                    ]
                }
            ]
        });
    }

}

function loadData(name) {
    $.getJSON('/index/spf/'+name, function (data) {
        if (data.state) {
            chart2.showLoading({text: '正在努力的读取数据中...'});

            if(name=='厦门市'){
                chart2.setOption({
                    xAxis : [
                        {
                            data : data.axis
                        },
                        {
                            data : data.axis
                        }
                    ],
                    series: [
                        {
                            name:'住宅套数',
                            data: data.sellSum
                        },
                        {
                            name:'总套数',
                            data: data.totalSum
                        },
                        {
                            name:'住宅面积',
                            data: data.sellArea
                        },
                        {
                            name:'总面积',
                            data: data.totalArea
                        },{
                            name: 'GDP占比',
                            data: [
                                {name: '第一产业', value: 10},
                                {name: '第二产业', value: 20},
                                {name: '第三产业', value: 15}
                            ]
                        }
                    ]
                });
            }else{
                chart2.setOption({
                    xAxis : [
                        {
                            data : data.axis
                        },
                        {
                            data : data.axis
                        }
                    ],
                    series: [
                        {
                            name:'住宅套数',
                            data: data.sellSum
                        },
                        {
                            name:'总套数',
                            data: data.totalSum
                        },
                        {
                            name:'住宅面积',
                            data: data.sellArea
                        },
                        {
                            name:'总面积',
                            data: data.totalArea
                        },
                        {
                            name: '占比',
                            data: []
                        }
                    ]
                });
            }

            chart2.hideLoading();
        }else {
            alert('提示', data.msg);
        }
    });
}


//载入图表
$(function () {
    chart2 = echarts.init(document.getElementById('second'));
    chart2.setOption(option2);
    //test1('厦门市');
    loadData('厦门市');
    window.addEventListener('resize', function () {
        chart2.resize();
    });
});