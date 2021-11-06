import axios from 'axios';
import { useEffect, useState } from 'react';
import Chart from 'react-apexcharts';
import { SaleSuccess } from 'types/sale';
import { round } from 'utils/format';
import { BASE_URL } from 'utils/request';

type SeriesData = {
    name: string;
    data: number[];
}

type ChartData = {
    labels: {
        categories: string[];
    };
    series: SeriesData[];
}

const BarChart = () => {

    const [chartData, setChartData] = useState<ChartData>({
        labels: {
            categories: []
        },
        series: [
            {
                name: "",
                data: []                   
            }
        ]
    });

    useEffect(() => {
        axios.get(`${BASE_URL}/sales/success-by-seller`).then(res => {
            const data = res.data as SaleSuccess[];
            const dataLabels = data.map(item => item.sellerName);
            const dataSeries = data.map(item => round(100 * item.deals / item.visited, 1));
            setChartData({
                labels: {
                    categories: dataLabels
                },
                series: [
                    {
                        name: "% Sucesso",
                        data: dataSeries                   
                    }
                ]
            });
        });
    }, []);

    const options = {
        plotOptions: {
            bar: {
                horizontal: true,
            }
        },
    };

    return (
        <Chart 
            options={{...options, xaxis: chartData.labels}} 
            series={chartData.series} 
            type="bar" 
            height="240"
        />
    );
}

export default BarChart;